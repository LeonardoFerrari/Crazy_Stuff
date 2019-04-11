/*
 * Faculdade de Tecnologia, UNICAMP
 * Professor responsável: Ivan L. M. Ricarte
 */
package igu;

import com.sun.javafx.scene.control.skin.TableViewSkin;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.ListChangeListener;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * @author ricarte at ft.unicamp.br
 */
public class GuiUtils {

    private static Method columnToFitMethod;

    static {
        try {
            columnToFitMethod = TableViewSkin.class.getDeclaredMethod("resizeColumnToFitContent", TableColumn.class, int.class);
            columnToFitMethod.setAccessible(true);
        } catch (NoSuchMethodException | SecurityException ex) {
            Logger.getLogger(GuiUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void autoFitTable(TableView tableView) {
        tableView.getItems().addListener(new ListChangeListener<Object>() {
            @Override
            public void onChanged(ListChangeListener.Change<? extends Object> c) {
                for (Object column : tableView.getColumns()) {
                    try {
                        columnToFitMethod.invoke(tableView.getSkin(), column, -1);
                    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                        Logger.getLogger(GuiUtils.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

        });
    }
}
