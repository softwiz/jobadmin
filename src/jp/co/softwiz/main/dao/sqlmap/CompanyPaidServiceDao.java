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

import jp.co.softwiz.main.domain.admin.CompanyPaidServiceInfoBean;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author jk-yun@softwiz.jp
 * @version
 */
public class CompanyPaidServiceDao extends SqlSessionDaoSupport {

	@Autowired protected SqlSessionTemplate sqlSessionTemplate;

	public List<CompanyPaidServiceInfoBean> selectList(CompanyPaidServiceInfoBean bean){
		return sqlSessionTemplate.selectList("CompanyPaidService.selectList", bean);
	}

	public CompanyPaidServiceInfoBean select(CompanyPaidServiceInfoBean bean) {
		return sqlSessionTemplate.selectOne("jp.co.softwiz.main.mapper.TCompanyPaidServiceInfoMapper.selectByPrimaryKey", bean);
	}

	public void insert(CompanyPaidServiceInfoBean bean) {
		sqlSessionTemplate.insert("jp.co.softwiz.main.mapper.TCompanyPaidServiceInfoMapper.insert", bean);
	}

	public void update(CompanyPaidServiceInfoBean bean) {
		sqlSessionTemplate.update("jp.co.softwiz.main.mapper.TCompanyPaidServiceInfoMapper.updateByPrimaryKeySelective", bean);
	}

	public void delete(CompanyPaidServiceInfoBean bean) {
		sqlSessionTemplate.delete("jp.co.softwiz.main.mapper.TCompanyPaidServiceInfoMapper.deleteByPrimaryKey", bean);
	}
}
