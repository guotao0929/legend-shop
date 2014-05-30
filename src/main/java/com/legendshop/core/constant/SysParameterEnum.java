package com.legendshop.core.constant;


public enum SysParameterEnum {
	DEFAULT_SHOP, EXPORT_SIZE, FRONT_PAGE_SIZE, LUCENE_INDEXER_CONTENT_LENGTH, PAGE_SIZE, SEARCH_ENTITY_PER_PAGE, SEARCH_INDEXING_ENABLED, SEND_MAIL, SUPPORT_MAIL_LIST, LUCENE_INDEXER_DB_FETCH_COUNT, MAX_FILE_SIZE, MAX_INDEX_JPG, ALLOWED_UPLOAD_FILE_TPYE, OPEN_SHOP, VALIDATION_ON_OPEN_SHOP, MAIL_NAME, MAIL_HOST, MAIL_PORT, MAIL_PASSWORD, MAIL_STMP_AUTH, MAIL_STMP_TIMEOUT, MAIL_PROPERTIES_CHANGED, VALIDATION_FROM_MAIL, COMMENT_LEVEL, VISIT_LOG_ENABLE, VISIT_LOG_INDEX_ENABLE, VISIT_HW_LOG_ENABLE, LOGIN_LOG_ENABLE, LUCENE_CURRENTLY_INDEXING, USE_SCORE, VALIDATION_IMAGE, INDEPEND_DOMAIN, STATIC_PAGE_SUPPORT;

	private Class clz = getClass();

	public Class getClazz() {
		return this.clz;
	}

}