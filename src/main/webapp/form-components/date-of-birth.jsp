<%--
  Created by IntelliJ IDEA.
  User: Mohamed Saber
  Date: 9/14/2024
  Time: 4:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<div class="form-group">
    <input class="stext-111 cl2 plh3 size-116 p-l-62 p-r-30 form-control" type="date" name="dob" placeholder="Date of Birth" id="dobInput" aria-describedby="dobHelp" data-bs-toggle="popover" data-bs-trigger="manual" value="${user.dob()}">
    <small id="dobHelp" class="form-text text-muted" style="visibility: hidden;">You must be at least 18 years old.</small>
</div>