
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Admin,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(admin: Admin):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.16*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">

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
                            Dashboard <small>Olá, """),_display_(/*71.52*/admin/*71.57*/.getLogin),format.raw/*71.66*/("""</small>
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
                            <i class="fa fa-info-circle"></i>  <strong>Like SB Admin?</strong> Try out <a href="http://startbootstrap.com/template-overviews/sb-admin-2" class="alert-link">SB Admin 2</a> for additional features!
                        </div>
                    </div>
                </div>
                <!-- /.row -->
                <div class="row">
                    <div class="col-lg-4 col-lg-offset-4">
                        <button class="btn btn-block btn-danger" data-toggle="modal" data-target="#adduser">Adicionar Usuario</button>
                    </div>
                </div>

              <div class="row">
                  <div class="col-lg-6 col-lg-offset-3">
                      <h2>Users</h2>
                      <div class="table-responsive">
                          <table class="table table-hover table-striped">
                              <thead>
                              <tr>
                                  <th>ID</th>
                                  <th>NAME</th>
                                  <th>CPF</th>
                                  <th>TOTAL</th>
                                  <th></th>
                                  <th></th>
                              </tr>
                              </thead>
                              <tbody>
                             """),_display_(/*112.31*/for(u <- SGDB.getAllUsers) yield /*112.57*/{_display_(Seq[Any](format.raw/*112.58*/("""
                                 """),format.raw/*113.34*/("""<tr>
                                     <td>"""),_display_(/*114.43*/u/*114.44*/.getId),format.raw/*114.50*/("""</td>
                                     <td>"""),_display_(/*115.43*/u/*115.44*/.getNome),format.raw/*115.52*/("""</td>
                                     <td>"""),_display_(/*116.43*/u/*116.44*/.getCpf),format.raw/*116.51*/("""</td>
                                     <td>"""),_display_(/*117.43*/u/*117.44*/.getTotal),format.raw/*117.53*/("""</td>
                                     <td><a href="/edit/"""),_display_(/*118.58*/u/*118.59*/.getId),format.raw/*118.65*/(""""><span class="fa fa-edit"></span> </a> </td>
                                     <td><a href="/remove/"""),_display_(/*119.60*/u/*119.61*/.getId),format.raw/*119.67*/(""""><span class="fa fa-trash"></span> </a> </td>
                                 </tr>
                             """)))}),format.raw/*121.31*/("""
                              """),format.raw/*122.31*/("""</tbody>
                          </table>
                      </div>
                  </div>
              </div>
                <!-- /.row -->

                <div class="modal fade" id="adduser" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                <h4 class="modal-title">Adicionar Usuario</h4>
                            </div>
                            <form method="post" action="/add/usuario">
                                <div class="modal-body">
                                    <div class="row">
                                        <div class="col-lg-8 col-lg-offset-2">
                                            <div class="form-group">
                                                <label>Nome</label>
                                                <input type="text" class="form-control" name="nome" required>
                                            </div>
                                            <div class="form-group">
                                                <label>CPF</label>
                                                <input type="text" class="form-control" name="cpf" id="campocpf" required>
                                            </div>
                                            <div class="form-group">
                                                <label>Total</label>
                                                <select class="form-control" name="total">
                                                    <option value="1">1</option>
                                                    <option value="2">2</option>
                                                    <option value="3">3</option>
                                                    <option value="4">4</option>
                                                    <option value="5">5</option>
                                                    <option value="6">6</option>
                                                    <option value="7">7</option>
                                                    <option value="8">8</option>
                                                    <option value="9">9</option>
                                                    <option value="10">10</option>
                                                </select>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                                    <button type="submit" class="btn btn-primary">Adicionar</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>

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
	<script>
		$(window).load(function () """),format.raw/*191.30*/("""{"""),format.raw/*191.31*/("""                
                """),format.raw/*192.17*/("""//Change image at regular intervals
                setInterval(function () """),format.raw/*193.41*/("""{"""),format.raw/*193.42*/("""
                    """),format.raw/*194.21*/("""location.reload();
                """),format.raw/*195.17*/("""}"""),format.raw/*195.18*/(""", 10000);
            """),format.raw/*196.13*/("""}"""),format.raw/*196.14*/(""");
	</script>

    <script>
        jQuery(function($)"""),format.raw/*200.27*/("""{"""),format.raw/*200.28*/("""
            """),format.raw/*201.13*/("""$("#campocpf").mask("999.999.999-99");
        """),format.raw/*202.9*/("""}"""),format.raw/*202.10*/(""");
    </script>


</body>

</html>
"""))}
  }

  def render(admin:Admin): play.twirl.api.HtmlFormat.Appendable = apply(admin)

  def f:((Admin) => play.twirl.api.HtmlFormat.Appendable) = (admin) => apply(admin)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Jul 03 19:45:58 BRT 2015
                  SOURCE: C:/Users/Caio/Downloads/anelrest/app/views/index.scala.html
                  HASH: 53c36509b951b5a806a21e451a725ae1a53ed44b
                  MATRIX: 722->1|824->15|852->17|1195->333|1209->338|1239->347|3605->2686|3619->2691|3649->2700|5590->4613|5633->4639|5673->4640|5737->4675|5813->4723|5824->4724|5852->4730|5929->4779|5940->4780|5970->4788|6047->4837|6058->4838|6087->4845|6164->4894|6175->4895|6206->4904|6298->4968|6309->4969|6337->4975|6471->5081|6482->5082|6510->5088|6660->5206|6721->5238|10503->8991|10533->8992|10596->9026|10702->9103|10732->9104|10783->9126|10848->9162|10878->9163|10930->9186|10960->9187|11047->9245|11077->9246|11120->9260|11196->9308|11226->9309
                  LINES: 26->1|29->1|30->2|41->13|41->13|41->13|99->71|99->71|99->71|140->112|140->112|140->112|141->113|142->114|142->114|142->114|143->115|143->115|143->115|144->116|144->116|144->116|145->117|145->117|145->117|146->118|146->118|146->118|147->119|147->119|147->119|149->121|150->122|219->191|219->191|220->192|221->193|221->193|222->194|223->195|223->195|224->196|224->196|228->200|228->200|229->201|230->202|230->202
                  -- GENERATED --
              */
          