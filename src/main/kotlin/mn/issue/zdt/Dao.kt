package mn.issue.zdt

import io.micronaut.data.annotation.Repository
import io.micronaut.data.jdbc.annotation.JdbcRepository
import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.repository.CrudRepository
import java.time.ZonedDateTime
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Test (
    @Id var id: String = "",
    var createdAt: ZonedDateTime = ZonedDateTime.now()
)

@Repository
@JdbcRepository(dialect = Dialect.POSTGRES)
interface TestDao : CrudRepository<Test, String> {

}
