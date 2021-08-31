<%--
  Created by IntelliJ IDEA.
  User: lzp
  Date: 2021/8/20
  Time: 13:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>电影详情</title>
    <style type="text/css">
        a {
            position: relative;
            display: block;
            text-decoration: none;
            color: #fff;
        }
        .film-detail {
            width: 100%;
            padding: 20px;
            box-sizing: border-box;
            overflow: hidden;
            border-radius: 5px;
            background: #2C2A2A;
        }

        h1 {
            margin: 0;
            color: #fff;
        }

        .film-name {
            font-size: 20px;
            margin-bottom: 10px;
        }

        .main-area {
            display: flex;
            justify-content: center;
        }

        .film-img {
            flex: 0 0 220px;
            height: 300px;
            margin-right: 20px;
        }

        .film-img img {
            width: 100%;
            height: 100%;
        }

        .film-msg {
            flex: 1 1 auto;
            padding: 15px;
            background: #fff;
            border-radius: 5px;
        }

        .play-info{
            margin-left: 20px;
            color: lightblue;
        }

    </style>
</head>
<body>

<div class="film-detail">
    <h1 class="film-name">${vo.filmName}</h1>
    <div class="main-area">
        <div class="film-img">
            <img src="${pageContext.request.contextPath}${vo.imgPath}" alt="">
        </div>
        <div class="film-msg">
            <p>导演: ${vo.director}</p>
            <p>主演: ${vo.player}</p>
            <p>类型: ${vo.type}</p>
            <p>片长: ${vo.length}分钟</p>
            <p>国家: ${vo.country}</p>
            <p>剧情简介: ${vo.synopsis}</p>
            <a class="play-info" href="play?filmId=${vo.filmId}">查看排片信息</a>
        </div>
    </div>
</div>
</body>
</html>
