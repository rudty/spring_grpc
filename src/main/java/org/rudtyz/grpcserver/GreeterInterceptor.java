package org.rudtyz.grpcserver;

import io.grpc.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 수동으로 @GRpcService 에 등록 필요
 * Bean 등록을 하지 않아도 동작함
 * 주입 받고싶은게 없다면 하지 않아도 괜찮을듯
 */
@Component
public class GreeterInterceptor implements ServerInterceptor {

    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(
            ServerCall<ReqT, RespT> call,
            Metadata headers,
            ServerCallHandler<ReqT, RespT> next) {
        var method = call.getMethodDescriptor();
        System.out.println(method.toString());
//        return next.startCall(call, headers);

        var ctx = Context.current()
                .withValue(Constant.CLIENT_ID,"b");
        return Contexts.interceptCall(ctx, call, headers, next);

    }
}
