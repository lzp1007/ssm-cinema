<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>售票系统</title>
    <style>
        body {
            margin: 0;
            background: #2C2A2A;
        }
        .container {
            display: flex;
            width: 80vw;
            padding: 20px 0;
            margin: 0 auto;
            flex-wrap: wrap;
            color: #fff;
            background: black;
            justify-content: space-around;
        }
        .film-item {
            width: 20%;
            margin:20px 10px;
        }

        a {
            position: relative;
            display: block;
            text-decoration: none;
            color: #fff;
        }
        .synopsis {
            position: absolute;
            width: 100%;
            height: 100%;
            opacity: 0;
            padding: 20px;
            font-size: 12px;
            overflow: hidden;
            box-sizing: border-box;
            background: rgba(0, 0, 0, .5);
            transition: all 1s;
        }

        .synopsis p {
            width: 100%;
            height: 100%;
            margin: 0;
            overflow: hidden;
        }

        .detail-link:hover .synopsis {
            opacity: 1;
        }

        img {
            width: 100%;
            height: 300px;
            display: block;
        }

        .msg {
            padding: 10px;
            background: #aaa;
            text-align: center;
            font-size: 16px;
            border-radius: 0 0 5px 5px;
        }
    </style>
</head>
<body>
    <div class="container">
        <c:forEach var="film" items="${filmVoList}">
            <div class="film-item">
                <a class="detail-link" href="filmInfo?filmId=${film.getFilmId()}">
                    <div class="synopsis">
                        <p>${film.getSynopsis()}</p>
                    </div>
                    <img src="${pageContext.request.contextPath}${film.imgPath}" alt="">
                </a>
                <div class="msg">
                    <p>${film.name}</p>
                    <p>${film.director}</p>
                </div>
            </div>
        </c:forEach>
    </div>
</body>
</html>
