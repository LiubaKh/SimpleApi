package com.example.simpleapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.SafeHtml;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Entity

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class product extends AbstractBaseEntity {

    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    private String brand;
    @NotNull
    private Integer price;
    @NotNull
    private Integer quantity;
}
