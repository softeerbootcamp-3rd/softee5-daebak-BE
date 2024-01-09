package com.softee5.daebak.repository;

import com.softee5.daebak.entity.Communication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommunicationRepository extends JpaRepository<Communication, String> {
    // 필요한 경우 추가적인 메소드를 정의할 수 있습니다.
}
