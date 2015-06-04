
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
object home extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.4*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title>Login</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />

    <link rel="stylesheet" type="text/css" href="/assets/css/bootstrap.min.css" />
    <link rel="stylesheet" type="text/css" href="/assets/font-awesome/css/font-awesome.min.css" />

    <script type="text/javascript" src="/assets/js/jquery.js"></script>
    <script type="text/javascript" src="/assets/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">

<div class="page-header">
    <h1>Login</h1>
</div>

<!-- Login Options - START -->

<div class="container colored" >
 <div class="col-md-4"></div>
    <div class="col-md-4">
        <div class="container" style="margin-top: 30px">
            <div class="col-md-4">
                <div class="login-panel panel panel-default">
                    <div class="panel-heading">
                        <h1 class="panel-title">Sign In</h1>
                    </div>
                    <div class="panel-body">
                        <form method="post" action="/login">
                            <fieldset>
                                <div class="form-group">
                                    <input class="form-control" placeholder="E-mail" name="login" type="text" required="required" autofocus="autofocus"/>
                                </div>
                                <div class="form-group">
                                    <input class="form-control" placeholder="Password" name="pass" type="password" required="required" />
                                </div>
                                <button type="submit" class="btn btn-sm btn-success">Sign in</button>
                            </fieldset>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="col-md-4"></div>
    </div>

<style>
    .colored """),format.raw/*55.14*/("""{"""),format.raw/*55.15*/("""
        """),format.raw/*56.9*/("""background-color: rgb(210, 210, 210);
    """),format.raw/*57.5*/("""}"""),format.raw/*57.6*/("""
"""),format.raw/*58.1*/("""</style>
<!-- Login Options - END -->

</div>

</body>
</html>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Jun 04 13:28:24 BRT 2015
                  SOURCE: C:/Users/Caio/Downloads/activator-1.2.10/demic/app/views/home.scala.html
                  HASH: e6f11fda6b972aa6d6d55ad33aa000698e4bb77d
                  MATRIX: 715->1|804->3|831->4|2825->1970|2854->1971|2890->1980|2959->2022|2987->2023|3015->2024
                  LINES: 26->1|29->1|30->2|83->55|83->55|84->56|85->57|85->57|86->58
                  -- GENERATED --
              */
          