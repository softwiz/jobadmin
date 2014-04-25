/*
	 * タイトル：カテゴリDaoImpl
	 * 説明    ：
	 *
	 * 著作権  ：Copyright(c) 2014 SOFTWIZ
	 * 会社名  ：株式会社 SOFTWIZ
	 *
	 * 変更履歴   ：2014/04/03
	 * 新規登録   :
*/

package jp.co.softwiz.main.dao.sqlmap;

import java.util.List;

import jp.co.softwiz.main.domain.admin.AreaInfoBean;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author jk-yun@softwiz.jp
 * @version
 */
public class AreaDao extends SqlSessionDaoSupport {

	@Autowired protected SqlSessionTemplate sqlSessionTemplate;

	public List<AreaInfoBean> selectList(AreaInfoBean bean){
		return sqlSessionTemplate.selectList("Area.selectList", bean);
	}

	public AreaInfoBean select(AreaInfoBean bean) {
		return sqlSessionTemplate.selectOne("jp.co.softwiz.main.mapper.TAreaInfoMapper.selectByPrimaryKey", bean);
	}

	public void insert(AreaInfoBean bean) {
		sqlSessionTemplate.insert("jp.co.softwiz.main.mapper.TAreaInfoMapper.insert", bean);
	}

	public void update(AreaInfoBean bean) {
		sqlSessionTemplate.update("jp.co.softwiz.main.mapper.TAreaInfoMapper.updateByPrimaryKeySelective", bean);
	}

	public void delete(AreaInfoBean bean) {
		sqlSessionTemplate.delete("jp.co.softwiz.main.mapper.TAreaInfoMapper.deleteByPrimaryKey", bean);
	}
}
