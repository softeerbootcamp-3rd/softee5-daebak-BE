package com.softee5.daebak.repository;

import com.softee5.daebak.entity.Cost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CostRepository extends JpaRepository<Cost, String> {
    // 필요한 경우 추가적인 쿼리 메소드를 정의할 수 있습니다.
}

