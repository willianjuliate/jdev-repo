<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">

<jsp:include page="head.jsp"></jsp:include>

<body>
	<!-- Pre-loader start -->
	<jsp:include page="theme-loader.jsp"></jsp:include>
	<!-- Pre-loader end -->
	<div id="pcoded" class="pcoded">
		<div class="pcoded-overlay-box"></div>
		<div class="pcoded-container navbar-wrapper">

			<jsp:include page="navbar.jsp"></jsp:include>

			<div class="pcoded-main-container">
				<div class="pcoded-wrapper">

					<jsp:include page="navbar-main-menu.jsp"></jsp:include>

					<div class="pcoded-content">
						<!-- Page-header start -->
						<jsp:include page="page-header.jsp"></jsp:include>
						<!-- Page-header end -->
						<div class="pcoded-inner-content">
							<!-- Main-body start -->
							<div class="main-body">
								<div class="page-wrapper">
									<!-- Page-body start -->
									<div class="page-body">
										<div class="card">
											<div class="card-header">
												<h5>Cadastro de Usuários</h5>
											</div>
											<div class="card-block">
												<form class="form-material" action="<%= request.getContextPath() %>/UsuarioController" method="post">
													<div class="form-group form-default">
														<input type="text" name="id" id="id"
															class="form-control" disabled readonly="readonly"> <span
															class="form-bar"></span> <label class="float-label">ID:</label>
													</div>
													<div class="form-group form-default">
														<input type="text" name="nome"
															class="form-control" required autocomplete="off"> <span
															class="form-bar"></span> <label class="float-label">Nome:</label>
													</div>
													<div class="form-group form-default">
														<input type="email" name="email"
															class="form-control" required autocomplete="off"> <span
															class="form-bar"></span> <label class="float-label">E-mail:</label>                                                           
													</div>
													<div class="form-group form-default">
														<input type="text" name="login"
															class="form-control" required autocomplete="off"> <span
															class="form-bar"></span> <label class="float-label">Login:
														</label>
													</div>
													<div class="form-group form-default">
														<input type="password" name="senha"
															class="form-control" required autocomplete="off"> <span
															class="form-bar"></span> <label class="float-label">Password:
														</label>
													</div>
													<button class="btn waves-effect waves-light btn-primary">
														<i class="icofont icofont-user-alt-3"></i>Novo
													</button>
													<button class="btn waves-effect waves-light btn-success">
														<i class="icofont icofont-check-circled"></i>Salvar
													</button>
													<button class="btn waves-effect waves-light btn-danger">
														<i class="icofont icofont-eye-alt"></i>Excluir
													</button>

												</form>
											</div>
										</div>
									</div>
									<!-- Page-body end -->
								</div>
								<div id="styleSelector"></div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<jsp:include page="javascrip-file-import.jsp"></jsp:include>
</body>

</html>
