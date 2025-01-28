package zb.weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zb.weather.domain.DateWeather;

import java.time.LocalDate;
import java.util.List;

public interface DateWeatherRepository extends JpaRepository<DateWeather, LocalDate> {
    List<DateWeather> findAllByDate(LocalDate date);
}
