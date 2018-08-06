package uk.gov.justice.services.common.util;

import java.time.LocalDate;
import java.time.ZonedDateTime;

/**
 * Interface for clock providers.
 */
public interface Clock {

    ZonedDateTime now();

    LocalDate today();
}
