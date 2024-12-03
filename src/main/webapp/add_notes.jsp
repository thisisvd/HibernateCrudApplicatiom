<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Notes</title>

    <jsp:include page="all_js_css.jsp"/>

</head>
<body>
    <div class="container-fluid p-0 m-0">
        <jsp:include page="navbar.jsp"/>

        <h1>Fill your notes details</h1>

        <%--Add Form--%>
        <form action="SaveNoteServlet" class="p-20 m-20 ">
            <div class="mb-3">
                <label for="title" class="form-label">Note Title</label>
                <input name="title" type="text" class="form-control" id="title" aria-describedby="emailHelp"
                       placeholder="Enter here" required="required">
                <div id="emailHelp" class="form-text"></div>
            </div>
            <div class="mb-3">
                <label for="content" class="form-label">Note Content/Description</label>
                <textarea name="content" id="content" placeholder="Enter your content here" class="form-control"
                          style="height: 200px" required></textarea>
            </div>

            <div class="container text-center">
                <button type="submit" class="btn btn-primary">Add</button>
            </div>
        </form>
    </div>
</body>
</html>
