<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>

<html>
    <body>
        <h2>Hello World! tralala</h2>
        <br/>

        <p>Message from server: ${requestScope.result}</p>
        <br/>

        <p>GET | SUM two values</p>
        <form method="get" action="FrontController">
            <input type="hidden" name="command" value="sum"/>
            <input type="number" name="number-1" value="0"/>
            <input type="number" name="number-2" value="0"/>
            <button type="submit" name="SubmitButtonType" value="sum">Submit</button>
        </form>
        <br/>

        <p>POST</p>
        <form method="post" action="FrontController">
            <input type="hidden" name="command" value="postInputParameter"/>
            <input type="text" name="message" value="..default value.."/>
            <button type="submit">Submit</button>
        </form>
    </body>
</html>
