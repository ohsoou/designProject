package org.example.designProject.entity;

import java.time.LocalDateTime;

public record Contents(int id, String title, String contents, User userId, LocalDateTime registerDtm, LocalDateTime modifyDtm) {
}
