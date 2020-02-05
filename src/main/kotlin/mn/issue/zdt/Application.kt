package mn.issue.zdt

import io.micronaut.runtime.Micronaut

object Application {
    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("mn.issue.zdt")
                .mainClass(Application.javaClass)
                .start()
    }
}