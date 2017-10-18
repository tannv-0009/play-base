package dao;

import com.google.inject.ImplementedBy;
import models.SRole;
import models.SUser;

import java.util.List;
import java.util.concurrent.CompletionStage;

@ImplementedBy(RoleJPARepository.class)
public interface RoleRepository {
    CompletionStage<SRole> add(SRole role);

    CompletionStage<SRole> update(SRole role);

    CompletionStage<List<SRole>> getAllRole();

    CompletionStage<SRole> getRoleById(int roleId);

    CompletionStage<Integer> deleteRoleByIds(String roleIds);
}
