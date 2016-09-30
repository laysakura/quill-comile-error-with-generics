import io.getquill.context.Context

import scala.reflect.ClassTag

object MyMain {
  def selectAll1[M](ctx: Context[_, _]) = {
    ctx.quote(ctx.query[M])
  }

  def selectAll2[M](ctx: Context[_, _])(implicit e: ClassTag[M]) = {
    ctx.quote(ctx.query[M](e))
  }

  def main(args: Array[String]): Unit = {}
}
