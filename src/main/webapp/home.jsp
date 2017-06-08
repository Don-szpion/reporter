<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
hello world


<c:forEach items="${list}" var="2">
    <c:out value="${l.student_id}"/>
    <c:out value="${l.name}"/>
    <c:out value="${l.mark}"/>
    <c:out value="${l.email}"/>
</c:forEach>