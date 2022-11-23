package com.capstone.notechigima.dto.invite;

import com.capstone.notechigima.domain.group_invite.GroupInvite;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class GroupInviteCreateRequestDTO {
    private int userId;
    private int groupId;

    @Builder
    public GroupInviteCreateRequestDTO(int userId, int groupId) {
        this.userId = userId;
        this.groupId = groupId;
    }

    public GroupInvite toEntity() {
        return GroupInvite.builder()
                .userId(userId)
                .groupId(groupId)
                .build();
    }
}
