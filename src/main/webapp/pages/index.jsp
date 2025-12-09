<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bootstrap demo</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h2>Report Application</h2>
		<form:form action="search" modelAttribute="search" method="post"
			class="form">
			<table class="table table-borderless">
				<tr>
					<td>Plan Name:</td>
					<td><form:select path="planName">
							<form:option value="">--select--</form:option>
							<form:options items="${names}" />
						</form:select></td>
					<td>Plan Status:</td>
					<td><form:select path="planStatus">
							<form:option value="">--select--</form:option>
							<form:options items="${status}" />
						</form:select></td>
					<td>Gender</td>
					<td><form:select path="gender">
							<form:option value="">--select--</form:option>
							<form:option value="Male">Male</form:option>
							<form:option value="Female">Female</form:option>
						</form:select></td>
				</tr>
				<tr>
					<td>StartDate</td>
					<td><form:input path="startDate" type="date"
							data-date-format="yyyy-mm-dd" /></td>
					<td>EndDate</td>
					<td><form:input path="endDate" type="date"
							data-date-format="yyyy-mm-dd" /></td>
				</tr>
				<tr>
					<td colspan="6"><input type="submit" value="Search"
						class="btn btn-primary" /></td>

				</tr>
			</table>
		</form:form>

		</hr>
		<table class="table table-striped">
			<thead>
				<th>Citizen Id</th>
				<th>Citizen Name</th>
				<th>Plan Name</th>
				<th>Plan Status</th>
				<th>Gender</th>
				<th>Start Date</th>
				<th>End Date</th>
				<th>benefit Amount</th>
			</thead>
			<tbody>
				<c:forEach items="${plans}" var="plan">
					<tr>
						<td>${plan.citizenId}</td>
						<td>${plan.citizenName}</td>
						<td>${plan.planName}</td>
						<td>${plan.planStatus}</td>
						<td>${plan.gender}</td>
						<td>${plan.startDate}</td>
						<td>${plan.endDate}</td>
						<td>${plan.benfitAmount}</td>
					</tr>
					<c:if test="${empty plans}">
				No records found
				</c:if>
				</c:forEach>
			</tbody>
			
		</table>
		</hr>

	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI"
		crossorigin="anonymous"></script>
</body>
</html>