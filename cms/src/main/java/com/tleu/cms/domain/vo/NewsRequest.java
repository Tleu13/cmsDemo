package com.tleu.cms.domain.vo;

import com.tleu.cms.domain.models.Category;
import com.tleu.cms.domain.models.Tag;
import lombok.Data;

import java.util.Set;

@Data
public class NewsRequest {
    private String title;

    private String content;

    private Set<Category> categories;

    private Set<Tag> tags;
}
