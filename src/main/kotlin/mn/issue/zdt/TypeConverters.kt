package mn.issue.zdt

import io.micronaut.context.annotation.Factory
import io.micronaut.core.convert.TypeConverter
import java.time.ZonedDateTime
import java.util.*
import javax.inject.Singleton

@Factory
class TypeConverters {

  @Singleton
  fun zdatetimeToUtilDate(): TypeConverter<ZonedDateTime, Date> {
    return TypeConverter { datetime, targetType, context -> Optional.of(Date.from((datetime).toInstant())) }
  }

}
