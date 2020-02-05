package mn.issue.zdt

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import java.security.Principal
import kotlin.random.Random

@Controller("/")
class Controller(val testDao: TestDao) {

  @Get("/insert")
  fun index(): String {
    val test = Test().apply {
      id = Random.nextInt().toString()
    }
    testDao.save(test)
    return "Inserted ${test.toString()}"
  }
}
