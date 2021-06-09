package io.sandeshn.ipldashboard.repository;

import org.springframework.data.repository.CrudRepository;

import io.sandeshn.ipldashboard.model.Team;

public interface TeamRepository extends CrudRepository<Team, Long>  {

    Team findByTeamName(String teamName);
    
}
