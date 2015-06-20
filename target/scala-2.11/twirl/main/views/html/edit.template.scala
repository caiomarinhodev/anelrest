
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object edit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Admin,Usuario,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(admin: Admin, user: Usuario):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.31*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en" xmlns="http://www.w3.org/1999/html">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>SB Admin - Olá """),_display_(/*13.28*/admin/*13.33*/.getLogin),format.raw/*13.42*/("""</title>

    <!-- Bootstrap Core CSS -->
    <link href="/assets/css/bootstrap.min.css" rel="stylesheet">
    <link href="/assets/font-awesome/css/font-awesome.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="/assets/css/sb-admin.css" rel="stylesheet">


    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

<div id="wrapper">

    <!-- Navigation -->
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="index.scala.html">SB Admin</a>
        </div>
        <!-- Top Menu Items -->
        <ul class="nav navbar-right top-nav">

        </ul>
        <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
        <div class="collapse navbar-collapse navbar-ex1-collapse">
            <ul class="nav navbar-nav side-nav">
                <li class="active">
                    <a href="index.scala.html"><i class="fa fa-fw fa-dashboard"></i> Dashboard</a>
                </li>
            </ul>
        </div>
        <!-- /.navbar-collapse -->
    </nav>

    <div id="page-wrapper">

        <div class="container-fluid">

            <!-- Page Heading -->
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">
                        Dashboard <small>Olá, """),_display_(/*71.48*/admin/*71.53*/.getLogin),format.raw/*71.62*/("""</small>
                    </h1>
                    <ol class="breadcrumb">
                        <li class="active">
                            <i class="fa fa-dashboard"></i> Dashboard
                        </li>
                    </ol>
                </div>
            </div>
            <!-- /.row -->

            <div class="row">
                <div class="col-lg-8 col-lg-offset-2">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h3 class="panel-title">Editar Usuario</h3>
                        </div>
                        <div class="panel-body">
                            <div class="row">
                                <form method="post" action="/incrementa">
                                    <div class="col-lg-8 col-lg-offset-2">
                                        <div class="form-group">
                                            <input class="form-control" name="nomeusuario" value="""),_display_(/*93.99*/user/*93.103*/.getNome),format.raw/*93.111*/(""" """),format.raw/*93.112*/("""disabled>
                                        </div>
                                        <input type="hidden" name="id" value="""),_display_(/*95.79*/user/*95.83*/.getId),format.raw/*95.89*/(""">
                                        <div class="form-group">
                                            <select class="form-control" name="total">
                                                <option value="5">5</option>
                                                <option value="10">10</option>
                                                <option value="15">15</option>
                                                <option value="20">20</option>
                                                <option value="25">25</option>
                                                <option value="50">50</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="col-lg-4 col-lg-offset-4">
                                        <input class="btn btn-primary btn-block" type="submit" value="Alterar">
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- /.row -->
        </div>
        <!-- /.container-fluid -->

    </div>
    <!-- /#page-wrapper -->

</div>
<!-- /#wrapper -->

<!-- jQuery -->
<script src="/assets/js/jquery.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="/assets/js/bootstrap.min.js"></script>
<script src="/assets/js/mask.js"></script>




</body>

</html>
"""))}
  }

  def render(admin:Admin,user:Usuario): play.twirl.api.HtmlFormat.Appendable = apply(admin,user)

  def f:((Admin,Usuario) => play.twirl.api.HtmlFormat.Appendable) = (admin,user) => apply(admin,user)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Jun 20 10:20:20 BRT 2015
                  SOURCE: C:/Users/Caio/Downloads/ANEL/anelrest/app/views/edit.scala.html
                  HASH: 06a05a43e35580f4678b6e00395e5d0a2c227bf9
                  MATRIX: 729->1|846->30|874->32|1253->384|1267->389|1297->398|3523->2597|3537->2602|3567->2611|4636->3653|4650->3657|4680->3665|4710->3666|4874->3803|4887->3807|4914->3813
                  LINES: 26->1|29->1|30->2|41->13|41->13|41->13|99->71|99->71|99->71|121->93|121->93|121->93|121->93|123->95|123->95|123->95
                  -- GENERATED --
              */
          