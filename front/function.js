function myfunction()
{
    const user = document.getElementsByName("login")[0].value;
    const pass = document.getElementsByName("password")[0].value;
    var xmlHttp = new XMLHttpRequest();
    xmlHttp.open( "GET", `http://localhost:8080/${user}/${pass}`, false );
    xmlHttp.send( null );
    alert(xmlHttp.responseText)
}
