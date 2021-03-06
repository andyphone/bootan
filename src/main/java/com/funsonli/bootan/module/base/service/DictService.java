package com.funsonli.bootan.module.base.service;

import com.funsonli.bootan.base.BaseService;
import com.funsonli.bootan.common.vo.SearchVO;
import com.funsonli.bootan.module.base.entity.Dict;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 字典接口
 * @author Funson
 */
public interface DictService extends BaseService<Dict, String> {

    /**
     * 列表搜索分页
     * @param model 对应的model
     * @param searchVO 搜索字符串
     * @param pageable 分页
     * @return Page<Department>
     */
    @Override
    Page<Dict> findByCondition(Dict model, SearchVO searchVO, Pageable pageable);

    @Override
    Dict beforeSave(Dict entity);

    List<Dict> findAllByTitleOrTitleLike(String keyword);

    Dict findByName(String name);
}
