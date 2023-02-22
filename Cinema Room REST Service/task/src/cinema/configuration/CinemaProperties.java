package cinema.configuration;

import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

import javax.annotation.PostConstruct;

@Slf4j
@Value
@ConfigurationProperties("cinema")
@ConstructorBinding
public class CinemaProperties {
    int totalRows;
    int totalColumns;
    int frontRows;
    int frontRowsPrice;
    int backRowsPrice;

    @PostConstruct
    void logLoaded() {
        log.info("totalRows = {}", totalRows);
        log.info("totalColumns = {}", totalColumns);
        log.info("frontRows = {}", frontRows);
        log.info("frontRowsPrice = {}", frontRowsPrice);
        log.info("backRowsPrice = {}", backRowsPrice);
    }
}
