package org.classroom.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * POJO object containing personal information like name
 *
 * @author alex
 *
 */
@AllArgsConstructor
@Getter
public class PersonalInformation
{
    /**
     * Person complete name
     */
    private String name;

}
