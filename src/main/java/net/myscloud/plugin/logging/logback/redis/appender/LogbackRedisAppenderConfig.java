package net.myscloud.plugin.logging.logback.redis.appender;

import ch.qos.logback.core.UnsynchronizedAppenderBase;
import lombok.Data;
import net.myscloud.plugin.logging.Kits;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * LogbackRedisAppenderConfig
 *
 * @author Genesis
 * @since 1.0
 */
@Data
public abstract class LogbackRedisAppenderConfig<E> extends UnsynchronizedAppenderBase<E> {
    private DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SZ");
    private String key = "log-stash";
    private String source = null;
    private String type = null;
    private String sourceHost = Kits.getIp();
}
