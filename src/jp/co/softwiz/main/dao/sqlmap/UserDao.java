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

import jp.co.softwiz.main.domain.admin.UserInfoBean;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author jk-yun@softwiz.jp
 * @version
 */
public class UserDao extends SqlSessionDaoSupport {

	@Autowired protected SqlSessionTemplate sqlSessionTemplate;

	public List<UserInfoBean> selectList(UserInfoBean bean){
		return sqlSessionTemplate.selectList("User.selectList", bean);
	}

	public UserInfoBean select(UserInfoBean bean) {
		return sqlSessionTemplate.selectOne("jp.co.softwiz.main.mapper.TUserInfoMapper.selectByPrimaryKey", bean);
	}

	public void insert(UserInfoBean bean) {
		sqlSessionTemplate.insert("jp.co.softwiz.main.mapper.TUserInfoMapper.insert", bean);
	}

	public void update(UserInfoBean bean) {
		sqlSessionTemplate.update("jp.co.softwiz.main.mapper.TUserInfoMapper.updateByPrimaryKeySelective", bean);
	}

	public void delete(UserInfoBean bean) {
		sqlSessionTemplate.delete("jp.co.softwiz.main.mapper.TUserInfoMapper.deleteByPrimaryKey", bean);
	}
}
