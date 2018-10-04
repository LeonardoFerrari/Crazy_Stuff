<html>
<head>
<title> Formulario pessoal </title>
<style>
    p.letrinha{
        font-family: "Times New Roman", Times, serif;
    }
    .center {
                text-align: center;   
            }
    table, th, td {
                border: 1px solid black;
                text-align: center;
    }
    h1 {
        margin-bottom: 20px;
        margin-left: 20px;
        color: #66FFFF;
        text-shadow: 5px 5px 5px black;
    }
    .info{
                background-image: linear-gradient(to bottom, rgba(255,255,255,0.74) 0%,rgba(255,255,255,0.74)100%),url("https://media.giphy.com/media/3otO6NFBIAFg2vPZuM/giphy.gif"); 
                background-size:auto;
                color: black;
                
    }
    .info2{
               background-image: linear-gradient(to bottom, rgba(255,255,255,0.74) 0%,rgba(255,255,255,0.74)80%),url("https://opendatawatch.com/wp-content/uploads/2015/12/data-graphic2.png");
               background-size:1366px 800px;
    }
    .submit input {
                background-color: #66FFFF;
                height: 40px;
                width: 100px;
                font-weight: bold;
                border-radius: 5px;
                -webkit-border-radius: 5px;
                -moz-border-radius: 5px;
                border: 1px solid;
                color: black;
    }
    .button{
                background-color: black;
                border: none;
                color: white;
                padding: 15px 32px;
                text-align: center;
                text-decoration: none;
                display: inline-block;
                font-size: 16px;
                margin: 4px 2px;
                cursor: pointer;
    }
    form {
        font-family: Verdana,Tahoma,sans-serif;
        font-size: 15px;
        background-color: #CC3300;
        max-width: 500px;
    }
</style>
<form name="form"> 
        <h1>Preencha com seus dados</h1>
 
        <p class="letrinha">
            <input type="text" id="nomeid" placeholder="Nome inteiro" required="required" name="nome" />
            <label for="nome">Nome</label>
        </p>
        <p class="letrinha">
            <input type="radio" id="sexoid" placeholder="masculino" name="sexo" />
            <label for="sexo">Sexo</label>
 
        </p>
        <p>
            <input type="email" id="emailid" placeholder="fulano@mail.com" name="email" />
            <label for="email">Email</label>
        </p>
        <p>
            <textarea placeholder="Deixe sua opnião"></textarea>
        </p>
        <p class="submit">
            <input type="submit" onclick="Enviar();" value="Enviar" />
        </p>
 
    </form>
    <script>
    function radio() {
    var x = document.createElement("INPUT");
    x.setAttribute("type", "radio");
    document.body.appendChild(x);
}
