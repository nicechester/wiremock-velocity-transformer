package org.apache.velocity.tools.generic;

import static java.time.format.DateTimeFormatter.ISO_LOCAL_DATE;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by chesterk on 2/6/18.
 */
public class DateRangeTool {
    public Collection<String> of(String start, String end) {
        LocalDate startDate = LocalDate.parse(start);
        LocalDate endDate = LocalDate.parse(end).plusDays(1);
        Collection<String> list = new ArrayList<>();
        for (LocalDate cur = startDate; cur.isBefore(endDate); cur = cur.plusDays(1)) {
            list.add(cur.format(ISO_LOCAL_DATE));
        }
        return list;
    }
}