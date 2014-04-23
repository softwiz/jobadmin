package jp.co.softwiz.main.common.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.softwiz.main.common.constants.CommonConst;
import jp.co.softwiz.main.dao.iface.admin.CategoryDaoInterface;
import jp.co.softwiz.main.domain.admin.CateMainBean;
import jp.co.softwiz.main.domain.admin.CateSubBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MItemCache extends AbstractCache<String, CateSubBean> {
    @Autowired private CategoryDaoInterface dao;

    @Override
    protected Map<String, List<CateSubBean>> getAll() {
    	Map<String, List<CateSubBean>> map = new HashMap<String, List<CateSubBean>>();
    	List<CateMainBean> list = dao.selectMasterList(null);
    	for (CateMainBean bean : list) {
    		if (!bean.getUsediv().equals(CommonConst.STRING_DELETE_FLAG_N)) {
    			map.put(bean.getMaincode(), dao.selectCateSubListForUseDiv(bean));
    		}
    	}
        return map;
    }
}
