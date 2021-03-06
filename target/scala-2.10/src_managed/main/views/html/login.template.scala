
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
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
object login extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Application.Login],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(form: Form[Application.Login]):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.33*/("""

<html>
    <head>
        <title>Zentasks</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*6.59*/routes/*6.65*/.Assets.at("images/favicon.png"))),format.raw/*6.97*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*7.70*/routes/*7.76*/.Assets.at("stylesheets/login.css"))),format.raw/*7.111*/("""">
    </head>
    <body>
        
        <header>
            <a href=""""),_display_(Seq[Any](/*12.23*/routes/*12.29*/.Projects.index)),format.raw/*12.44*/("""" id="logo"><span>Zen</span>tasks</a>
        </header>
        
        """),_display_(Seq[Any](/*15.10*/helper/*15.16*/.form(routes.Application.authenticate)/*15.54*/ {_display_(Seq[Any](format.raw/*15.56*/("""
            
            <h1>Sign in</h1>
            
            """),_display_(Seq[Any](/*19.14*/if(form.hasGlobalErrors)/*19.38*/ {_display_(Seq[Any](format.raw/*19.40*/(""" 
                <p class="error">
                    """),_display_(Seq[Any](/*21.22*/form/*21.26*/.globalError.message)),format.raw/*21.46*/("""
                </p>
            """)))})),format.raw/*23.14*/("""
            
            """),_display_(Seq[Any](/*25.14*/if(flash.contains("success"))/*25.43*/ {_display_(Seq[Any](format.raw/*25.45*/("""
                <p class="success">
                    """),_display_(Seq[Any](/*27.22*/flash/*27.27*/.get("success"))),format.raw/*27.42*/("""
                </p>
            """)))})),format.raw/*29.14*/("""
            
            <p>
                <input type="email" name="email" placeholder="Email" value=""""),_display_(Seq[Any](/*32.78*/form("email")/*32.91*/.value)),format.raw/*32.97*/("""">
            </p>
            <p>
                <input type="password" name="password" placeholder="Password">
            </p>
            <p>
                <button type="submit">Login</button>
            </p>
            
        """)))})),format.raw/*41.10*/("""
        
        <p class="note">
            Try <em>guillaume@sample.com</em> with <em>secret</em> as password.
        </p>
            
    </body>
</html>
    


"""))}
    }
    
    def render(form:Form[Application.Login]): play.api.templates.Html = apply(form)
    
    def f:((Form[Application.Login]) => play.api.templates.Html) = (form) => apply(form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Aug 31 11:01:49 ART 2013
                    SOURCE: C:/Users/Maximiliano/Documents/play-2.1.2/samples/java/zentasks/app/views/login.scala.html
                    HASH: 72505de252af625ee3c8fccff85c2a060ff1cb93
                    MATRIX: 740->1|848->32|993->142|1007->148|1060->180|1167->252|1181->258|1238->293|1348->367|1363->373|1400->388|1510->462|1525->468|1572->506|1612->508|1717->577|1750->601|1790->603|1883->660|1896->664|1938->684|2005->719|2068->746|2106->775|2146->777|2240->835|2254->840|2291->855|2358->890|2501->997|2523->1010|2551->1016|2823->1256
                    LINES: 26->1|29->1|34->6|34->6|34->6|35->7|35->7|35->7|40->12|40->12|40->12|43->15|43->15|43->15|43->15|47->19|47->19|47->19|49->21|49->21|49->21|51->23|53->25|53->25|53->25|55->27|55->27|55->27|57->29|60->32|60->32|60->32|69->41
                    -- GENERATED --
                */
            