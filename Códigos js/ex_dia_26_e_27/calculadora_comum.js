function sum()
{
    if(document.getElementById("num1").value == "" || document.getElementById("num2").value == "")
    {   
        document.getElementById("res").value = "valores faltando";
    } else 
    {
        document.getElementById("res").value = parseFloat(document.getElementById("num1").value) + parseFloat(document.getElementById("num2").value);
    }
}

function sub()
{
    if(document.getElementById("num1").value == "" || document.getElementById("num2").value == "")
    {   
        document.getElementById("res").value = "valores faltando";
    } else 
    {
        document.getElementById("res").value = parseFloat(document.getElementById("num1").value) - parseFloat(document.getElementById("num2").value);
    }
}
function mul()
{
    if(document.getElementById("num1").value == "" || document.getElementById("num2").value == "")
    {   
        document.getElementById("res").value = "valores faltando";
    } else 
    {
        document.getElementById("res").value = parseFloat(document.getElementById("num1").value) * parseFloat(document.getElementById("num2").value);
    }
}
function div()
{
    if(document.getElementById("num1").value == "" || document.getElementById("num2").value == "")
    {   
        document.getElementById("res").value = "valores faltando";
    } else 
    {
        document.getElementById("res").value = parseFloat(document.getElementById("num1").value) / parseFloat(document.getElementById("num2").value);
    }
}
function pow()
{
    if(document.getElementById("num1").value == "" || document.getElementById("num2").value == "")
    {   
        document.getElementById("res").value = "valores faltando";
    } else 
    {
        document.getElementById("res").value = Math.pow(parseFloat(document.getElementById("num1").value), parseFloat(document.getElementById("num2").value));
    }
}
function rem()
{
    if(document.getElementById("num1").value == "" || document.getElementById("num2").value == "")
    {   
        document.getElementById("res").value = "valores faltando";
    } else 
    {
        document.getElementById("res").value = parseFloat(document.getElementById("num1").value) % parseFloat(document.getElementById("num2").value);
    }
}