<%-- 
    Document   : index
    Created on : 11/11/2014, 09:39:23 PM
    Author     : Angel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mi Login</title>
        <link href='http://fonts.googleapis.com/css?family=Pinyon+Script' rel='stylesheet' type='text/css'>
        <style type="text/css">
            *{
                margin: 0px;
                padding: 0px;
            }  
            body{
          background: url(bg.png)#2b2b2a;
          background-position: center;
          }     
          form{
              background: #333333;
              width: 360px;
              border: 1px solid #4e4d4d;
              border-radius: 3px;
              -moz-border-radius: 3px;
              -webkit-border-radius: 3px;
              box-shadow: insert 0 0 10px #000;
              margin: 100px auto;
          }
          form h1{
              text-align: center;
              color:#fff;
              font-weight: normal;
              font-size:40pt ;
              margin: 30px 0px;
              font-family: 'Pinyon Script', cursive;
          }
          form input{
              width: 280px;
              height: 35px;
              padding: 0px 10px;
              margin: 10px 30px;
              color: #6d6d6d;
              text-align: center;
          }
          form button{
              with:135px;
              margin: 20px 0px 30px 30px;
              height: 40px;
              background: #3c3c3c; /* Old browsers */
/* IE9 SVG, needs conditional override of 'filter' to 'none' */
background: #3c3c3c; /* Old browsers */
/* IE9 SVG, needs conditional override of 'filter' to 'none' */
background: url(data:image/svg+xml;base64,PD94bWwgdmVyc2lvbj0iMS4wIiA/Pgo8c3ZnIHhtbG5zPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwL3N2ZyIgd2lkdGg9IjEwMCUiIGhlaWdodD0iMTAwJSIgdmlld0JveD0iMCAwIDEgMSIgcHJlc2VydmVBc3BlY3RSYXRpbz0ibm9uZSI+CiAgPGxpbmVhckdyYWRpZW50IGlkPSJncmFkLXVjZ2ctZ2VuZXJhdGVkIiBncmFkaWVudFVuaXRzPSJ1c2VyU3BhY2VPblVzZSIgeDE9IjAlIiB5MT0iMCUiIHgyPSIwJSIgeTI9IjEwMCUiPgogICAgPHN0b3Agb2Zmc2V0PSIwJSIgc3RvcC1jb2xvcj0iIzNjM2MzYyIgc3RvcC1vcGFjaXR5PSIxIi8+CiAgICA8c3RvcCBvZmZzZXQ9IjEwMCUiIHN0b3AtY29sb3I9IiMyYTI4MjgiIHN0b3Atb3BhY2l0eT0iMSIvPgogIDwvbGluZWFyR3JhZGllbnQ+CiAgPHJlY3QgeD0iMCIgeT0iMCIgd2lkdGg9IjEiIGhlaWdodD0iMSIgZmlsbD0idXJsKCNncmFkLXVjZ2ctZ2VuZXJhdGVkKSIgLz4KPC9zdmc+);
background: -moz-linear-gradient(top,  #3c3c3c 0%, #2a2828 100%); /* FF3.6+ */
background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,#3c3c3c), color-stop(100%,#2a2828)); /* Chrome,Safari4+ */
background: -webkit-linear-gradient(top,  #3c3c3c 0%,#2a2828 100%); /* Chrome10+,Safari5.1+ */
background: -o-linear-gradient(top,  #3c3c3c 0%,#2a2828 100%); /* Opera 11.10+ */
background: -ms-linear-gradient(top,  #3c3c3c 0%,#2a2828 100%); /* IE10+ */
background: linear-gradient(to bottom,  #3c3c3c 0%,#2a2828 100%); /* W3C */
filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#3c3c3c', endColorstr='#2a2828',GradientType=0 ); /* IE6-8 */

    border: 1px solid #232323;
    color:#fff;
    box-shadow: 0px 2px 0px #000;
    -moz-box-shadow:2px 2px 2px #000;
    -webkit-box-shadow:0px 2px 0px #000;
     border-radius: 3px;
    -moz-border-radius: 3px;
    -webkit-border-radius: 3px;          
          }
          form button:hover{
               background:#3a3a3a;     
          }
          form button:active{
              background: #3c3c3c; /* Old browsers */
/* IE9 SVG, needs conditional override of 'filter' to 'none' */
background: url(data:image/svg+xml;base64,PD94bWwgdmVyc2lvbj0iMS4wIiA/Pgo8c3ZnIHhtbG5zPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwL3N2ZyIgd2lkdGg9IjEwMCUiIGhlaWdodD0iMTAwJSIgdmlld0JveD0iMCAwIDEgMSIgcHJlc2VydmVBc3BlY3RSYXRpbz0ibm9uZSI+CiAgPGxpbmVhckdyYWRpZW50IGlkPSJncmFkLXVjZ2ctZ2VuZXJhdGVkIiBncmFkaWVudFVuaXRzPSJ1c2VyU3BhY2VPblVzZSIgeDE9IjAlIiB5MT0iMCUiIHgyPSIwJSIgeTI9IjEwMCUiPgogICAgPHN0b3Agb2Zmc2V0PSIwJSIgc3RvcC1jb2xvcj0iIzNjM2MzYyIgc3RvcC1vcGFjaXR5PSIxIi8+CiAgICA8c3RvcCBvZmZzZXQ9IjM4JSIgc3RvcC1jb2xvcj0iIzFlMDA5NiIgc3RvcC1vcGFjaXR5PSIxIi8+CiAgICA8c3RvcCBvZmZzZXQ9IjEwMCUiIHN0b3AtY29sb3I9IiMyYTI4MjgiIHN0b3Atb3BhY2l0eT0iMSIvPgogIDwvbGluZWFyR3JhZGllbnQ+CiAgPHJlY3QgeD0iMCIgeT0iMCIgd2lkdGg9IjEiIGhlaWdodD0iMSIgZmlsbD0idXJsKCNncmFkLXVjZ2ctZ2VuZXJhdGVkKSIgLz4KPC9zdmc+);
background: -moz-linear-gradient(top,  #3c3c3c 0%, #1e0096 38%, #2a2828 100%); /* FF3.6+ */
background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,#3c3c3c), color-stop(38%,#1e0096), color-stop(100%,#2a2828)); /* Chrome,Safari4+ */
background: -webkit-linear-gradient(top,  #3c3c3c 0%,#1e0096 38%,#2a2828 100%); /* Chrome10+,Safari5.1+ */
background: -o-linear-gradient(top,  #3c3c3c 0%,#1e0096 38%,#2a2828 100%); /* Opera 11.10+ */
background: -ms-linear-gradient(top,  #3c3c3c 0%,#1e0096 38%,#2a2828 100%); /* IE10+ */
background: linear-gradient(to bottom,  #3c3c3c 0%,#1e0096 38%,#2a2828 100%); /* W3C */
filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#3c3c3c', endColorstr='#2a2828',GradientType=0 ); /* IE6-8 */

          }
        form
         
        </style>
              
    </head>
    <body>
        <form><h1>::Cuenta::</h1>
            <input type="text" max-length="20" placeholder="Ingrese su usuario"/>
            <input type="password" max-length="20" placeholder="Ingrese su password"/>
            <button type="button">Iniciar Sesion</button>
            <button type="subimit">Registrarse</button>
        </form>
    </body>
</html>










