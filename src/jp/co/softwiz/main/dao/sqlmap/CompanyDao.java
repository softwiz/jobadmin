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

import jp.co.softwiz.main.domain.admin.CompanyInfoBean;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author jk-yun@softwiz.jp
 * @version
 */
public class CompanyDao extends SqlSessionDaoSupport {

	@Autowired protected SqlSessionTemplate sqlSessionTemplate;

	public List<CompanyInfoBean> selectList(CompanyInfoBean bean){
		return sqlSessionTemplate.selectList("Company.selectList", bean);
	}

	public CompanyInfoBean select(CompanyInfoBean bean) {
		return sqlSessionTemplate.selectOne("jp.co.softwiz.main.mapper.TCompanyInfoMapper.selectByPrimaryKey", bean);
	}

	public void insert(CompanyInfoBean bean) {
		sqlSessionTemplate.insert("jp.co.softwiz.main.mapper.TCompanyInfoMapper.insert", bean);
	}

	public void update(CompanyInfoBean bean) {
		sqlSessionTemplate.update("jp.co.softwiz.main.mapper.TCompanyInfoMapper.updateByPrimaryKeySelective", bean);
	}

	public void delete(CompanyInfoBean bean) {
		sqlSessionTemplate.delete("jp.co.softwiz.main.mapper.TCompanyInfoMapper.deleteByPrimaryKey", bean);
	}
}
