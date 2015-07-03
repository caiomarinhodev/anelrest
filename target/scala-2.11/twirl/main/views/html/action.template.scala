
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
object action extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Admin,Usuario,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(admin: Admin, user: Usuario):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.31*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">

<head>


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
                            Dashboard <small>Olá, """),_display_(/*49.52*/admin/*49.57*/.getLogin),format.raw/*49.66*/("""</small>
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
                    <div class="col-lg-12">
                        <div class="alert alert-info alert-dismissable">
                            <i class="fa fa-info-circle"></i>  <strong>Abaixo Copie o Link e gere um QR CODE</strong>
                        </div>
                    </div>
                </div>
                <!-- /.row -->

              <div class="row">
                  <div class="col-lg-8 col-lg-offset-2">
                      <div class="panel panel-default">
                          <div class="panel-heading">
                              <h3 class="panel-title">Nome: """),_display_(/*73.62*/user/*73.66*/.getNome),format.raw/*73.74*/("""</h3>
                          </div>
                          <div class="panel-body">
                              <div class="row">
                                  <div class="col-lg-8 col-lg-offset-2">
                                      https://anel.herokuapp.com/decrementa/"""),_display_(/*78.78*/user/*78.82*/.getId),format.raw/*78.88*/("""
                                  """),format.raw/*79.35*/("""</div>
                                  <div class="col-lg-4 col-lg-offset-4">
                                      <a class="btn btn-primary btn-block" href="/index">OK</a>
                                  </div>
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
                  DATE: Fri Jul 03 19:45:58 BRT 2015
                  SOURCE: C:/Users/Caio/Downloads/anelrest/app/views/action.scala.html
                  HASH: c37bd63478e369946dc4df332c9e11f183166cae
                  MATRIX: 731->1|848->30|876->32|2612->1741|2626->1746|2656->1755|3704->2776|3717->2780|3746->2788|4066->3081|4079->3085|4106->3091|4170->3127
                  LINES: 26->1|29->1|30->2|77->49|77->49|77->49|101->73|101->73|101->73|106->78|106->78|106->78|107->79
                  -- GENERATED --
              */
          