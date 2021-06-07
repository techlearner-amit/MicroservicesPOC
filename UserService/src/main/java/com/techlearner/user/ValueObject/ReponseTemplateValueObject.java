package com.techlearner.user.ValueObject;

import com.techlearner.user.entity.User_Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReponseTemplateValueObject {
private User_Entity user;
private Department department;
}
