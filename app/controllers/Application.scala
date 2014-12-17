package controllers

import play.api._
import play.api.mvc._
import play.api.libs.concurrent.Execution.Implicits.defaultContext

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def hello = Action {
    Ok(views.html.index("Hello man~"))
  }

  def compute = Action.async {
    val futureInt = scala.concurrent.Future {
      intensiveComputation()
    }
    futureInt.map(i => Ok("Got result: " + i))
  }

  def intensiveComputation(): Int = {
    fib(20)
  }

  def fib( n : Int) : Int = {
    n match {
      case 0 | 1 => n
      case _ => fib(n - 1) + fib(n - 2)
    }
  }
}