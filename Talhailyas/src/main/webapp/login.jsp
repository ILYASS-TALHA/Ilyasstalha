<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>


<html>

    
    <head>
        <title>Sign Up</title>
    </head>
    
    <style>
    
        *{margin: 0; padding: 0;}
        body{background: #ecf1f4; font-family: sans-serif;}
        
        .form-wrap{ width: 320px; background: #3e3d3d; padding: 40px 20px; box-sizing: border-box; position: fixed; left: 50%; top: 50%; transform: translate(-50%, -50%);}
        h1{text-align: center; color: #fff; font-weight: normal; margin-bottom: 20px;}
        
        input{width: 100%; background: none; border: 1px solid #fff; border-radius: 3px; padding: 6px 15px; box-sizing: border-box; margin-bottom: 20px; font-size: 16px; color: #fff;}
        
        input[type="submit"]{ background: #bac675; border: 0; cursor: pointer; color: #3e3d3d;}
        input[type="submmit"]:hover{ background: #a4b15c; transition: .6s;}
        
        ::placeholder{color: #fff;}
        h3{text-align: center;}
         .message {
  margin: 15px 0 0;
  color: #ffffff;
  font-size: 12px;
}
 .message a {
  color: #4CAF50;
  text-decoration: none;
}
    
    </style>

    <body>
    
        <div class="form-wrap">
        
            <form action="Login" method="post">
            
                <h1>Sign In</h1>
      
       <input type="text" placeholder="Login" name="log"/>
      <input type="password" placeholder="password" name="pass"/>
                <input type="submit" value="Sign IN">
                <h3 class="or">or</h3>
                 <p class="message"> <a href="Inscri.jsp">Sign Up</a></p>
            </form>
        
        </div>
    
    
    
    </body>



</html>