package org.rudtyz.grpcserver;

import io.grpc.Context;

public class Constant {
    /**
     * Context golang 의 그것과 유사함
     *
     * 내부 구현 Context 확인 결과 객체로 검색을 하고 있으므로
     * 서비스에서 Context.current().get ... 으로는 동작하지 않음
     * 반드시 미리 정의한 것으로 활용할 것.
     *
     * thread local 을 활용
     */
    public static Context.Key<String> CLIENT_ID = Context.key("id");
}
