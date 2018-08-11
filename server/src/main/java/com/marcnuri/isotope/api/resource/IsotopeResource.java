/*
 * IsotopeResource.java
 *
 * Created on 2018-08-11, 8:31
 */
package com.marcnuri.isotope.api.resource;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.ResourceSupport;

import java.util.List;

/**
 * Created by Marc Nuri <marc@marcnuri.com> on 2018-08-11.
 */
public class IsotopeResource extends ResourceSupport {

    @JsonProperty("_links")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonSerialize(using = LinkSerializer.class)
    public List<Link> getLinks() {
        return super.getLinks();
    }
}
