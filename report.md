## com.dshatz.kni.buffers.BufferTest.invalid operations

| Name | iosSimulatorArm64 | js, browser, Firefox149.0, Linux0.0.0 | js, browser, Firefox149.0, MacOS10.15 | js, browser, Firefox149.0, Windows10 | js, node | macosArm64 | mingwX64 | tvosSimulatorArm64 | wasmJs, browser, Firefox149.0, Linux0.0.0 | wasmJs, browser, Firefox149.0, MacOS10.15 | wasmJs, browser, Firefox149.0, Windows10 | wasmJs, node | watchosSimulatorArm64 |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- | :--- | :--- | :--- | :--- | :--- | :--- | :--- | 
| allocate negative size | ✅ 2ms | ✅ 1ms | ✅ 1ms | ✅ 0s | ✅ 1ms | ✅ 0s | ✅ 1ms | ✅ 0s | ✅ 0s | ✅ 1ms | ✅ 0s | ✅ 2ms | ✅ 0s |
| read out of bounds | ✅ 1ms | ✅ 0s | ✅ 0s | ✅ 0s | ✅ 2ms | ✅ 0s | ✅ 1ms | ✅ 0s | ✅ 0s | ✅ 0s | ✅ 0s | ✅ 0s | ✅ 0s |
| read overflow destination | ✅ 1ms | ✅ 0s | ✅ 0s | ✅ 0s | ✅ 5ms | ✅ 0s | ✅ 0s | ✅ 1ms | ✅ 0s | ✅ 0s | ✅ 0s | ✅ 0s | ✅ 0s |
| read from negative offset | ✅ 1ms | ✅ 0s | ✅ 0s | ✅ 0s | ✅ 3ms | ✅ 0s | ✅ 1ms | ✅ 0s | ✅ 0s | ✅ 0s | ✅ 0s | ✅ 2ms | ✅ 1ms |
| write negative offset | ✅ 65ms | ✅ 0s | ✅ 1ms | ✅ 1ms | ✅ 2ms | ✅ 32ms | ✅ 65ms | ✅ 27ms | ✅ 0s | ✅ 0s | ✅ 0s | ✅ 8ms | ✅ 29ms |
| write past end | ✅ 36ms | ✅ 0s | ✅ 0s | ✅ 0s | ✅ 0s | ✅ 33ms | ✅ 40ms | ✅ 35ms | ✅ 0s | ✅ 1ms | ✅ 0s | ✅ 3ms | ✅ 18ms |
### ✅ 102 tests passed
## com.dshatz.kni.buffers.BufferTest

| Name | iosSimulatorArm64 | js, browser, Firefox149.0, Linux0.0.0 | js, browser, Firefox149.0, MacOS10.15 | js, browser, Firefox149.0, Windows10 | js, node | macosArm64 | mingwX64 | tvosSimulatorArm64 | wasmJs, browser, Firefox149.0, Linux0.0.0 | wasmJs, browser, Firefox149.0, MacOS10.15 | wasmJs, browser, Firefox149.0, Windows10 | wasmJs, node | watchosSimulatorArm64 |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- | :--- | :--- | :--- | :--- | :--- | :--- | :--- | 
| write read | ✅ 1ms | ✅ 0s | ✅ 1ms | ✅ 0s | ✅ 4ms | ✅ 1ms | ✅ 1ms | ✅ 0s | ✅ 0s | ✅ 4ms | ✅ 1ms | ✅ 12ms | ✅ 0s |
| release | ✅ 3ms | ✅ 0s | ✅ 0s | ✅ 1ms | ✅ 1ms | ✅ 0s | ✅ 1ms | ✅ 1ms | ✅ 0s | ✅ 1ms | ✅ 0s | ✅ 2ms | ✅ 0s |
### ✅ 34 tests passed
## com.dshatz.kni.buffers.JsBufferTest

| Name | js, browser, Firefox149.0, Linux0.0.0 | js, browser, Firefox149.0, MacOS10.15 | js, browser, Firefox149.0, Windows10 | js, node |
| :--- | :--- | :--- | :--- | :--- | 
| allocate and write | ✅ 2ms | ✅ 4ms | ✅ 4ms | ✅ 27ms |
| to blob | ✅ 0s | ✅ 0s | ✅ 0s | ✅ 4ms |
| as int8array | ✅ 0s | ✅ 1ms | ✅ 0s | ✅ 2ms |
### ✅ 18 tests passed
## TestSession.@Default.BufferTest

| Name | jvm (Linux) | jvm (Windows) | jvm (macOS) |
| :--- | :--- | :--- | :--- | 
| write read 〈2〉 | ✅ 5ms | ✅ 5ms | ✅ 4ms |
| release | ✅ 4ms | ✅ 2ms | ✅ 1ms |
### ✅ 6 tests passed
## TestSession.@Default.BufferTest.invalid operations

| Name | jvm (Linux) | jvm (Windows) | jvm (macOS) |
| :--- | :--- | :--- | :--- | 
| allocate negative size | ✅ 3ms | ✅ 2ms | ✅ 3ms |
| read out of bounds | ✅ 12ms | ✅ 8ms | ✅ 9ms |
| read overflow destination | ✅ 9ms | ✅ 6ms | ✅ 5ms |
| read from negative offset | ✅ 5ms | ✅ 2ms | ✅ 1ms |
| write negative offset | ✅ 26ms | ✅ 12ms | ✅ 32ms |
| write past end | ✅ 17ms | ✅ 21ms | ✅ 24ms |
### ✅ 18 tests passed
## TestSession.@Default.JvmBufferTest

| Name | jvm (Linux) | jvm (Windows) | jvm (macOS) |
| :--- | :--- | :--- | :--- | 
| convert | ✅ 513ms | ✅ 353ms | ✅ 319ms |
| write read | ✅ 13ms | ✅ 11ms | ✅ 15ms |
### ✅ 6 tests passed
## com.dshatz.kni.buffers.NativeBufferTest

| Name | iosSimulatorArm64 | macosArm64 | mingwX64 | tvosSimulatorArm64 | watchosSimulatorArm64 |
| :--- | :--- | :--- | :--- | :--- | :--- | 
| release native heap | ✅ 1ms | ✅ 1ms | ✅ 1ms | ✅ 0s | ✅ 1ms |
| wrap ByteArray | ✅ 0s | ✅ 0s | ✅ 0s | ✅ 1ms | ✅ 0s |
| wrap address | ❌ 1ms | ❌ 0s | ❌ 1ms | ❌ 0s | ✅ 1ms |
### ❌ 4 / 15 tests failed
<details >
<summary >❌

 `wrap address` on mingwX64 failed after 1ms


</summary>
<blockquote >

| Name | Platform | Failure |
| :--- | :--- | :--- | 
| wrap address ❌ | mingwX64 | kotlin.AssertionError: -103 should not equal -103 |
```log
kotlin.AssertionError: -103 should not equal -103
	at kotlin.Error#<init>(Unknown Source)
	at kotlin.AssertionError#<init>(Unknown Source)
	at io.kotest.assertions.Exceptions#createAssertionError(Unknown Source)
	at io.kotest.assertions#failure(Unknown Source)
	at io.kotest.assertions#failure(Unknown Source)
	at io.kotest.matchers#invokeMatcher(Unknown Source)
	at io.kotest.matchers#should__at__0:0(Unknown Source)
	at io.kotest.matchers#shouldNot__at__0:0(Unknown Source)
	at io.kotest.matchers#shouldNotBe__at__0:0(Unknown Source)
	at com.dshatz.kni.buffers.NativeBufferTest$2.NativeBufferTest$2$invoke$3.invoke#internal(Unknown Source)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.Test.Test$executeInTestScope$2.invoke#internal(Unknown Source)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.internal.runTestAwaitingCompletion$2.invoke#internal(Unknown Source)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(Unknown Source)
	at kotlinx.coroutines.test.runTest$$inlined$let$1.runTest$$inlined$let$1$invoke$2.$invokeCOROUTINE$0.invokeSuspend#internal(Unknown Source)
	at kotlin.coroutines.native.internal.BaseContinuationImpl#invokeSuspend(Unknown Source)
	at kotlin.coroutines.native.internal.BaseContinuationImpl#resumeWith(Unknown Source)
	at kotlin.coroutines.Continuation#resumeWith(Unknown Source)
	at kotlinx.coroutines.DispatchedTask#run(Unknown Source)
	at kotlinx.coroutines.Runnable#run(Unknown Source)
	at kotlinx.coroutines.test.TestDispatcher#processEvent(Unknown Source)
	at kotlinx.coroutines.test.TestCoroutineScheduler#tryRunNextTaskUnless(Unknown Source)
	at kotlinx.coroutines.test.runTest$$inlined$let$1.runTest$$inlined$let$1$invoke$3.$invokeCOROUTINE$1.invokeSuspend#internal(Unknown Source)
	at kotlinx.coroutines.test.runTest$$inlined$let$1.runTest$$inlined$let$1$invoke$3.invoke#internal(Unknown Source)
	at kotlin.Function2#invoke(Unknown Source)
	at kotlin.coroutines.intrinsics.createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$2.invokeSuspend#internal(Unknown Source)
	at kotlin.coroutines.native.internal.BaseContinuationImpl#invokeSuspend(Unknown Source)
	at kotlin.coroutines.native.internal.BaseContinuationImpl#resumeWith(Unknown Source)
	at kotlin.coroutines.Continuation#resumeWith(Unknown Source)
	at kotlinx.coroutines.DispatchedTask#run(Unknown Source)
	at kotlinx.coroutines.Runnable#run(Unknown Source)
	at kotlinx.coroutines.EventLoopImplBase#processNextEvent(Unknown Source)
	at kotlinx.coroutines.EventLoop#processNextEvent(Unknown Source)
	at kotlinx.coroutines.BlockingCoroutine.joinBlocking#internal(Unknown Source)
	at kotlinx.coroutines#runBlocking(Unknown Source)
	at kotlinx.coroutines#runBlocking$default(Unknown Source)
	at kotlinx.coroutines.test#createTestResult(Unknown Source)
	at kotlinx.coroutines.test#runTest__at__kotlinx.coroutines.test.TestScope(Unknown Source)
	at de.infix.testBalloon.framework.core.internal#runTestAwaitingCompletion#suspend__at__kotlinx.coroutines.test.TestScope(Unknown Source)
	at de.infix.testBalloon.framework.core.Test.$executeInTestScopeCOROUTINE$1.invokeSuspend#internal(Unknown Source)
	at de.infix.testBalloon.framework.core.Test.executeInTestScope#internal(Unknown Source)
	at de.infix.testBalloon.framework.core.Test.Test$execute$2.Test$execute$2$invoke$2.$invokeCOROUTINE$0.invokeSuspend#internal(Unknown Source)
	at de.infix.testBalloon.framework.core.Test.Test$execute$2.Test$execute$2$invoke$2.invoke#internal(Unknown Source)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.TestConfig.TestConfig$executeWrapped$invocationGuardingAction$1.$invokeCOROUTINE$1.invokeSuspend#internal(Unknown Source)
	at de.infix.testBalloon.framework.core.TestConfig.TestConfig$executeWrapped$invocationGuardingAction$1.invoke#internal(Unknown Source)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.TestConfig.$executeWrappedCOROUTINE$3.invokeSuspend#internal(Unknown Source)
	at de.infix.testBalloon.framework.core.TestConfig#executeWrapped#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.Test.Test$execute$2.invoke#internal(Unknown Source)
	at kotlin.coroutines.SuspendFunction0#invoke#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.TestElement.TestElement$executeReporting$2.$invokeCOROUTINE$0.invokeSuspend#internal(Unknown Source)
	at de.infix.testBalloon.framework.core.TestElement.TestElement$executeReporting$2.invoke#internal(Unknown Source)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.TestConfig.$withExecutionReportSetupCOROUTINE$4.invokeSuspend#internal(Unknown Source)
	at de.infix.testBalloon.framework.core.TestConfig#withExecutionReportSetup#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.TestElement#executeReporting#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.Test#execute#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.TestElement#execute#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.TestSuite$execute$2$invoke$2.TestSuite$execute$2$invoke$2$invoke$2.$invokeCOROUTINE$0.invokeSuspend#internal(Unknown Source)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.TestSuite$execute$2$invoke$2.TestSuite$execute$2$invoke$2$invoke$2.invoke#internal(Unknown Source)
	at kotlin.Function2#invoke(Unknown Source)
	at kotlinx.coroutines.intrinsics.startUndspatched#internal(Unknown Source)
	at kotlinx.coroutines.intrinsics#startUndispatchedOrReturn__at__kotlinx.coroutines.internal.ScopeCoroutine<0:0>(Unknown Source)
	at kotlinx.coroutines#coroutineScope#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.TestSuite$execute$2$invoke$2.$invokeCOROUTINE$1.invokeSuspend#internal(Unknown Source)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.TestSuite$execute$2$invoke$2.invoke#internal(Unknown Source)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.TestConfig.TestConfig$executeWrapped$invocationGuardingAction$1.$invokeCOROUTINE$1.invokeSuspend#internal(Unknown Source)
	at de.infix.testBalloon.framework.core.TestConfig.TestConfig$executeWrapped$invocationGuardingAction$1.invoke#internal(Unknown Source)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.TestConfig.TestConfig$executeWrapped$$inlined$wrapIfNotNull$1.invoke#internal(Unknown Source)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$suiteLifecycleAction$1.$invokeCOROUTINE$4.invokeSuspend#internal(Unknown Source)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$suiteLifecycleAction$1.invoke#internal(Unknown Source)
	at kotlin.coroutines.SuspendFunction2#invoke#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.TestConfig.$executeWrappedCOROUTINE$3.invokeSuspend#internal(Unknown Source)
	at de.infix.testBalloon.framework.core.TestConfig#executeWrapped#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.$invokeCOROUTINE$2.invokeSuspend#internal(Unknown Source)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.invoke#internal(Unknown Source)
	at kotlin.coroutines.SuspendFunction0#invoke#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.TestElement.TestElement$executeReporting$2.$invokeCOROUTINE$0.invokeSuspend#internal(Unknown Source)
	at de.infix.testBalloon.framework.core.TestElement.TestElement$executeReporting$2.invoke#internal(Unknown Source)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.TestConfig.$withExecutionReportSetupCOROUTINE$4.invokeSuspend#internal(Unknown Source)
	at de.infix.testBalloon.framework.core.TestConfig#withExecutionReportSetup#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.TestElement#executeReporting#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.TestSuite#execute#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.TestElement#execute#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.TestSuite$execute$2$invoke$2.TestSuite$execute$2$invoke$2$invoke$2.$invokeCOROUTINE$0.invokeSuspend#internal(Unknown Source)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.TestSuite$execute$2$invoke$2.TestSuite$execute$2$invoke$2$invoke$2.invoke#internal(Unknown Source)
	at kotlin.Function2#invoke(Unknown Source)
	at kotlinx.coroutines.intrinsics.startUndspatched#internal(Unknown Source)
	at kotlinx.coroutines.intrinsics#startUndispatchedOrReturn__at__kotlinx.coroutines.internal.ScopeCoroutine<0:0>(Unknown Source)
	at kotlinx.coroutines#coroutineScope#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.TestSuite$execute$2$invoke$2.$invokeCOROUTINE$1.invokeSuspend#internal(Unknown Source)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.TestSuite$execute$2$invoke$2.invoke#internal(Unknown Source)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.TestConfig.TestConfig$executeWrapped$invocationGuardingAction$1.$invokeCOROUTINE$1.invokeSuspend#internal(Unknown Source)
	at de.infix.testBalloon.framework.core.TestConfig.TestConfig$executeWrapped$invocationGuardingAction$1.invoke#internal(Unknown Source)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.TestConfig.TestConfig$executeWrapped$$inlined$wrapIfNotNull$1.invoke#internal(Unknown Source)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$suiteLifecycleAction$1.$invokeCOROUTINE$4.invokeSuspend#internal(Unknown Source)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$suiteLifecycleAction$1.invoke#internal(Unknown Source)
	at kotlin.coroutines.SuspendFunction2#invoke#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.TestConfig.$executeWrappedCOROUTINE$3.invokeSuspend#internal(Unknown Source)
	at de.infix.testBalloon.framework.core.TestConfig#executeWrapped#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.$invokeCOROUTINE$2.invokeSuspend#internal(Unknown Source)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.invoke#internal(Unknown Source)
	at kotlin.coroutines.SuspendFunction0#invoke#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.TestElement.TestElement$executeReporting$2.$invokeCOROUTINE$0.invokeSuspend#internal(Unknown Source)
	at de.infix.testBalloon.framework.core.TestElement.TestElement$executeReporting$2.invoke#internal(Unknown Source)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.TestConfig.$withExecutionReportSetupCOROUTINE$4.invokeSuspend#internal(Unknown Source)
	at de.infix.testBalloon.framework.core.TestConfig#withExecutionReportSetup#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.TestElement#executeReporting#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.TestSuite#execute#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.TestElement#execute#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.TestSuite$execute$2$invoke$2.TestSuite$execute$2$invoke$2$invoke$2.$invokeCOROUTINE$0.invokeSuspend#internal(Unknown Source)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.TestSuite$execute$2$invoke$2.TestSuite$execute$2$invoke$2$invoke$2.invoke#internal(Unknown Source)
	at kotlin.Function2#invoke(Unknown Source)
	at kotlinx.coroutines.intrinsics.startUndspatched#internal(Unknown Source)
	at kotlinx.coroutines.intrinsics#startUndispatchedOrReturn__at__kotlinx.coroutines.internal.ScopeCoroutine<0:0>(Unknown Source)
	at kotlinx.coroutines#coroutineScope#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.TestSuite$execute$2$invoke$2.$invokeCOROUTINE$1.invokeSuspend#internal(Unknown Source)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.TestSuite$execute$2$invoke$2.invoke#internal(Unknown Source)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.TestConfig.TestConfig$executeWrapped$invocationGuardingAction$1.$invokeCOROUTINE$1.invokeSuspend#internal(Unknown Source)
	at de.infix.testBalloon.framework.core.TestConfig.TestConfig$executeWrapped$invocationGuardingAction$1.invoke#internal(Unknown Source)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.TestConfig.TestConfig$executeWrapped$$inlined$wrapIfNotNull$1.invoke#internal(Unknown Source)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$suiteLifecycleAction$1.$invokeCOROUTINE$4.invokeSuspend#internal(Unknown Source)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$suiteLifecycleAction$1.invoke#internal(Unknown Source)
	at kotlin.coroutines.SuspendFunction2#invoke#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.TestConfig.TestConfig$executionWrapping$1.TestConfig$executionWrapping$1$invoke$2.invoke#internal(Unknown Source)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.testScope$1.testScope$1$invoke$2.invoke#internal(Unknown Source)
	at kotlin.Function2#invoke(Unknown Source)
	at kotlinx.coroutines.intrinsics.startUndspatched#internal(Unknown Source)
	at kotlinx.coroutines.intrinsics#startUndispatchedOrReturn__at__kotlinx.coroutines.internal.ScopeCoroutine<0:0>(Unknown Source)
	at kotlinx.coroutines#withContext#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.testScope$1.$invokeCOROUTINE$7.invokeSuspend#internal(Unknown Source)
	at de.infix.testBalloon.framework.core.testScope$1.invoke#internal(Unknown Source)
	at kotlin.coroutines.SuspendFunction2#invoke#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.TestConfig.TestConfig$executionWrapping$1.TestConfig$executionWrapping$1$invoke$2.invoke#internal(Unknown Source)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.coroutineContext$1.coroutineContext$1$invoke$2.invoke#internal(Unknown Source)
	at kotlin.Function2#invoke(Unknown Source)
	at kotlinx.coroutines.intrinsics.startUndspatched#internal(Unknown Source)
	at kotlinx.coroutines.intrinsics#startUndispatchedOrReturn__at__kotlinx.coroutines.internal.ScopeCoroutine<0:0>(Unknown Source)
	at kotlinx.coroutines#withContext#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.coroutineContext$1.invoke#internal(Unknown Source)
	at kotlin.coroutines.SuspendFunction2#invoke#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.TestConfig.TestConfig$executionWrapping$1.TestConfig$executionWrapping$1$invoke$2.invoke#internal(Unknown Source)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.coroutineContext$1.coroutineContext$1$invoke$2.invoke#internal(Unknown Source)
	at kotlin.Function2#invoke(Unknown Source)
	at kotlinx.coroutines.intrinsics.startUndspatched#internal(Unknown Source)
	at kotlinx.coroutines.intrinsics#startUndispatchedOrReturn__at__kotlinx.coroutines.internal.ScopeCoroutine<0:0>(Unknown Source)
	at kotlinx.coroutines#withContext#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.coroutineContext$1.invoke#internal(Unknown Source)
	at kotlin.coroutines.SuspendFunction2#invoke#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.TestConfig.TestConfig$executionWrapping$1.invoke#internal(Unknown Source)
	at kotlin.coroutines.SuspendFunction2#invoke#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.TestConfig.TestConfig$executionWrapping$1.invoke#internal(Unknown Source)
	at kotlin.coroutines.SuspendFunction2#invoke#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.TestConfig.TestConfig$executionWrapping$1.invoke#internal(Unknown Source)
	at kotlin.coroutines.SuspendFunction2#invoke#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.TestConfig.$executeWrappedCOROUTINE$3.invokeSuspend#internal(Unknown Source)
	at de.infix.testBalloon.framework.core.TestConfig#executeWrapped#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.$invokeCOROUTINE$2.invokeSuspend#internal(Unknown Source)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.invoke#internal(Unknown Source)
	at kotlin.coroutines.SuspendFunction0#invoke#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.TestElement.TestElement$executeReporting$2.$invokeCOROUTINE$0.invokeSuspend#internal(Unknown Source)
	at de.infix.testBalloon.framework.core.TestElement.TestElement$executeReporting$2.invoke#internal(Unknown Source)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.TestConfig.$withExecutionReportSetupCOROUTINE$4.invokeSuspend#internal(Unknown Source)
	at de.infix.testBalloon.framework.core.TestConfig#withExecutionReportSetup#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.TestElement#executeReporting#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.TestSuite#execute#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.TestSession#execute#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.internal.$setUpAndExecuteTestsCOROUTINE$0.invokeSuspend#internal(Unknown Source)
	at de.infix.testBalloon.framework.core.internal#setUpAndExecuteTests#suspend(Unknown Source)
	at de.infix.testBalloon.framework.core.internal.setUpAndExecuteTestsBlocking$1.invoke#internal(Unknown Source)
	at kotlin.Function2#invoke(Unknown Source)
	at kotlin.coroutines.intrinsics.createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$2.invokeSuspend#internal(Unknown Source)
	at kotlin.coroutines.native.internal.BaseContinuationImpl#invokeSuspend(Unknown Source)
	at kotlin.coroutines.native.internal.BaseContinuationImpl#resumeWith(Unknown Source)
	at kotlin.coroutines.Continuation#resumeWith(Unknown Source)
	at kotlinx.coroutines.DispatchedTask#run(Unknown Source)
	at kotlinx.coroutines.Runnable#run(Unknown Source)
	at kotlinx.coroutines.MultiWorkerDispatcher.MultiWorkerDispatcher$workerRunLoop$1.$invokeCOROUTINE$0.invokeSuspend#internal(Unknown Source)
	at kotlinx.coroutines.MultiWorkerDispatcher.MultiWorkerDispatcher$workerRunLoop$1.invoke#internal(Unknown Source)
	at kotlin.Function2#invoke(Unknown Source)
	at kotlin.coroutines.intrinsics.createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$2.invokeSuspend#internal(Unknown Source)
	at kotlin.coroutines.native.internal.BaseContinuationImpl#invokeSuspend(Unknown Source)
	at kotlin.coroutines.native.internal.BaseContinuationImpl#resumeWith(Unknown Source)
	at kotlin.coroutines.Continuation#resumeWith(Unknown Source)
	at kotlinx.coroutines.DispatchedTask#run(Unknown Source)
	at kotlinx.coroutines.Runnable#run(Unknown Source)
	at kotlinx.coroutines.EventLoopImplBase#processNextEvent(Unknown Source)
	at kotlinx.coroutines.EventLoop#processNextEvent(Unknown Source)
	at kotlinx.coroutines.BlockingCoroutine.joinBlocking#internal(Unknown Source)
	at kotlinx.coroutines#runBlocking(Unknown Source)
	at kotlinx.coroutines#runBlocking$default(Unknown Source)
	at kotlinx.coroutines.MultiWorkerDispatcher.workerRunLoop#internal(Unknown Source)
	at kotlinx.coroutines.MultiWorkerDispatcher.MultiWorkerDispatcher$1.MultiWorkerDispatcher$1$invoke$$inlined$apply$1.invoke#internal(Unknown Source)
	at kotlinx.coroutines.MultiWorkerDispatcher.MultiWorkerDispatcher$1.MultiWorkerDispatcher$1$invoke$$inlined$apply$1.$<bridge-DN>invoke(Unknown Source)
	at kotlin.Function0#invoke(Unknown Source)
	at <global>.WorkerExecuteAfterLaunchpad(Unknown Source)
	at <global>._ZN6Worker19processQueueElementEb(Unknown Source)
	at <global>._ZN12_GLOBAL__N_113workerRoutineEPv(Unknown Source)
	at <global>.pthread_create_wrapper(Unknown Source)
	at <global>._ZSt25__throw_bad_function_callv(Unknown Source)
	at <global>._ZSt25__throw_bad_function_callv(Unknown Source)
	at <global>._ZSt25__throw_bad_function_callv(Unknown Source)
	at <global>._ZSt25__throw_bad_function_callv(Unknown Source)

```

</blockquote>

</details>

<details >
<summary >❌

 `wrap address` on tvosSimulatorArm64 failed after 0s


</summary>
<blockquote >

| Name | Platform | Failure |
| :--- | :--- | :--- | 
| wrap address ❌ | tvosSimulatorArm64 | kotlin.AssertionError: -103 should not equal -103 |
```log
kotlin.AssertionError: -103 should not equal -103
	at kotlin.Error#<init>(/opt/buildAgent/work/2886554ce455f6e1/kotlin/kotlin-native/runtime/src/main/kotlin/kotlin/Exceptions.kt:14)
	at kotlin.AssertionError#<init>(/opt/buildAgent/work/2886554ce455f6e1/kotlin/kotlin-native/runtime/src/main/kotlin/kotlin/Exceptions.kt:129)
	at io.kotest.assertions.Exceptions#createAssertionError(/Users/runner/work/kotest/kotest/kotest-assertions/kotest-assertions-shared/src/desktopMain/kotlin/io/kotest/assertions/Exceptions.kt:10)
	at io.kotest.assertions#failure(/Users/runner/work/kotest/kotest/kotest-assertions/kotest-assertions-shared/src/commonMain/kotlin/io/kotest/assertions/failures.kt:33)
	at io.kotest.assertions#failure(/Users/runner/work/kotest/kotest/kotest-assertions/kotest-assertions-shared/src/commonMain/kotlin/io/kotest/assertions/failures.kt:23)
	at io.kotest.matchers#invokeMatcher(/Users/runner/work/kotest/kotest/kotest-assertions/kotest-assertions-shared/src/commonMain/kotlin/io/kotest/matchers/should.kt:59)
	at io.kotest.matchers#should__at__0:0(/Users/runner/work/kotest/kotest/kotest-assertions/kotest-assertions-shared/src/commonMain/kotlin/io/kotest/matchers/should.kt:33)
	at io.kotest.matchers#shouldNot__at__0:0(/Users/runner/work/kotest/kotest/kotest-assertions/kotest-assertions-shared/src/commonMain/kotlin/io/kotest/matchers/should.kt:66)
	at io.kotest.matchers#shouldNotBe__at__0:0(/Users/runner/work/kotest/kotest/kotest-assertions/kotest-assertions-shared/src/commonMain/kotlin/io/kotest/matchers/should.kt:26)
	at com.dshatz.kni.buffers.NativeBufferTest$2.NativeBufferTest$2$invoke$3.invoke#internal(/Users/runner/work/Kotlin-JNI/Kotlin-JNI/buffers/src/nativeTest/kotlin/com/dshatz/kni/buffers/NativeBufferTest.kt:72)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.Test.Test$executeInTestScope$2.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/Test.kt:106)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.internal.runTestAwaitingCompletion$2.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/nativeMain/kotlin/de/infix/testBalloon/framework/core/internal/TestFramework.native.kt:43)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at kotlinx.coroutines.test.runTest$$inlined$let$1.runTest$$inlined$let$1$invoke$2.$invokeCOROUTINE$0.invokeSuspend#internal(/opt/buildAgent/work/2886554ce455f6e1/kotlin/libraries/stdlib/src/kotlin/util/Standard.kt:166)
	at kotlin.coroutines.native.internal.BaseContinuationImpl#invokeSuspend(/opt/buildAgent/work/2886554ce455f6e1/kotlin/kotlin-native/runtime/src/main/kotlin/kotlin/coroutines/ContinuationImpl.kt:50)
	at kotlin.coroutines.native.internal.BaseContinuationImpl#resumeWith(/opt/buildAgent/work/2886554ce455f6e1/kotlin/kotlin-native/runtime/src/main/kotlin/kotlin/coroutines/ContinuationImpl.kt:30)
	at kotlin.coroutines.Continuation#resumeWith(/opt/buildAgent/work/2886554ce455f6e1/kotlin/libraries/stdlib/src/kotlin/coroutines/Continuation.kt:26)
	at kotlinx.coroutines.DispatchedTask#run(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/common/src/internal/DispatchedTask.kt:100)
	at kotlinx.coroutines.Runnable#run(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/native/src/Runnable.kt:12)
	at kotlinx.coroutines.test.TestDispatcher#processEvent(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-test/common/src/TestDispatcher.kt:24)
	at kotlinx.coroutines.test.TestCoroutineScheduler#tryRunNextTaskUnless(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-test/common/src/TestCoroutineScheduler.kt:99)
	at kotlinx.coroutines.test.runTest$$inlined$let$1.runTest$$inlined$let$1$invoke$3.$invokeCOROUTINE$1.invokeSuspend#internal(/opt/buildAgent/work/2886554ce455f6e1/kotlin/libraries/stdlib/src/kotlin/util/Standard.kt:166)
	at kotlinx.coroutines.test.runTest$$inlined$let$1.runTest$$inlined$let$1$invoke$3.invoke#internal(/opt/buildAgent/work/2886554ce455f6e1/kotlin/libraries/stdlib/src/kotlin/util/Standard.kt:166)
	at kotlin.Function2#invoke(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at kotlin.coroutines.intrinsics.createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$2.invokeSuspend#internal(/opt/buildAgent/work/2886554ce455f6e1/kotlin/kotlin-native/runtime/src/main/kotlin/kotlin/coroutines/intrinsics/IntrinsicsNative.kt:254)
	at kotlin.coroutines.native.internal.BaseContinuationImpl#invokeSuspend(/opt/buildAgent/work/2886554ce455f6e1/kotlin/kotlin-native/runtime/src/main/kotlin/kotlin/coroutines/ContinuationImpl.kt:50)
	at kotlin.coroutines.native.internal.BaseContinuationImpl#resumeWith(/opt/buildAgent/work/2886554ce455f6e1/kotlin/kotlin-native/runtime/src/main/kotlin/kotlin/coroutines/ContinuationImpl.kt:30)
	at kotlin.coroutines.Continuation#resumeWith(/opt/buildAgent/work/2886554ce455f6e1/kotlin/libraries/stdlib/src/kotlin/coroutines/Continuation.kt:26)
	at kotlinx.coroutines.DispatchedTask#run(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/common/src/internal/DispatchedTask.kt:100)
	at kotlinx.coroutines.Runnable#run(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/native/src/Runnable.kt:12)
	at kotlinx.coroutines.EventLoopImplBase#processNextEvent(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/common/src/EventLoop.common.kt:263)
	at kotlinx.coroutines.EventLoop#processNextEvent(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/common/src/EventLoop.common.kt:49)
	at kotlinx.coroutines.BlockingCoroutine.joinBlocking#internal(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/native/src/Builders.kt:131)
	at kotlinx.coroutines#runBlocking(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/native/src/Builders.kt:70)
	at kotlinx.coroutines#runBlocking$default(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/native/src/Builders.kt:47)
	at kotlinx.coroutines.test#createTestResult(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-test/native/src/TestBuilders.kt:7)
	at kotlinx.coroutines.test#runTest__at__kotlinx.coroutines.test.TestScope(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-test/common/src/TestBuilders.kt:309)
	at de.infix.testBalloon.framework.core.internal#runTestAwaitingCompletion#suspend__at__kotlinx.coroutines.test.TestScope(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/nativeMain/kotlin/de/infix/testBalloon/framework/core/internal/TestFramework.native.kt:43)
	at de.infix.testBalloon.framework.core.Test.$executeInTestScopeCOROUTINE$1.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/Test.kt:100)
	at de.infix.testBalloon.framework.core.Test.executeInTestScope#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/Test.kt:98)
	at de.infix.testBalloon.framework.core.Test.Test$execute$2.Test$execute$2$invoke$2.$invokeCOROUTINE$0.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/Test.kt:83)
	at de.infix.testBalloon.framework.core.Test.Test$execute$2.Test$execute$2$invoke$2.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/Test.kt:69)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.TestConfig.TestConfig$executeWrapped$invocationGuardingAction$1.$invokeCOROUTINE$1.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:115)
	at de.infix.testBalloon.framework.core.TestConfig.TestConfig$executeWrapped$invocationGuardingAction$1.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:114)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.TestConfig.$executeWrappedCOROUTINE$3.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:124)
	at de.infix.testBalloon.framework.core.TestConfig#executeWrapped#suspend(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:109)
	at de.infix.testBalloon.framework.core.Test.Test$execute$2.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/Test.kt:69)
	at kotlin.coroutines.SuspendFunction0#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.TestElement.TestElement$executeReporting$2.$invokeCOROUTINE$0.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestElement.kt:375)
	at de.infix.testBalloon.framework.core.TestElement.TestElement$executeReporting$2.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestElement.kt:362)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.TestConfig.$withExecutionReportSetupCOROUTINE$4.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:143)
	at de.infix.testBalloon.framework.core.TestConfig#withExecutionReportSetup#suspend(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:134)
	at de.infix.testBalloon.framework.core.TestElement#executeReporting#suspend(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestElement.kt:362)
	at de.infix.testBalloon.framework.core.Test#execute#suspend(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/Test.kt:66)
	at de.infix.testBalloon.framework.core.TestElement#execute#suspend(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestElement.kt:338)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.TestSuite$execute$2$invoke$2.TestSuite$execute$2$invoke$2$invoke$2.$invokeCOROUTINE$0.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:240)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.TestSuite$execute$2$invoke$2.TestSuite$execute$2$invoke$2$invoke$2.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:236)
	at kotlin.Function2#invoke(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at kotlinx.coroutines.intrinsics.startUndspatched#internal(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/common/src/intrinsics/Undispatched.kt:66)
	at kotlinx.coroutines.intrinsics#startUndispatchedOrReturn__at__kotlinx.coroutines.internal.ScopeCoroutine<0:0>(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/common/src/intrinsics/Undispatched.kt:43)
	at kotlinx.coroutines#coroutineScope#suspend(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/common/src/CoroutineScope.kt:286)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.TestSuite$execute$2$invoke$2.$invokeCOROUTINE$1.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:236)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.TestSuite$execute$2$invoke$2.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:229)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.TestConfig.TestConfig$executeWrapped$invocationGuardingAction$1.$invokeCOROUTINE$1.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:115)
	at de.infix.testBalloon.framework.core.TestConfig.TestConfig$executeWrapped$invocationGuardingAction$1.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:114)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.TestConfig.TestConfig$executeWrapped$$inlined$wrapIfNotNull$1.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:441)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$suiteLifecycleAction$1.$invokeCOROUTINE$4.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:288)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$suiteLifecycleAction$1.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:282)
	at kotlin.coroutines.SuspendFunction2#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.TestConfig.$executeWrappedCOROUTINE$3.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:124)
	at de.infix.testBalloon.framework.core.TestConfig#executeWrapped#suspend(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:109)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.$invokeCOROUTINE$2.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:229)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:226)
	at kotlin.coroutines.SuspendFunction0#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.TestElement.TestElement$executeReporting$2.$invokeCOROUTINE$0.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestElement.kt:375)
	at de.infix.testBalloon.framework.core.TestElement.TestElement$executeReporting$2.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestElement.kt:362)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.TestConfig.$withExecutionReportSetupCOROUTINE$4.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:143)
	at de.infix.testBalloon.framework.core.TestConfig#withExecutionReportSetup#suspend(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:134)
	at de.infix.testBalloon.framework.core.TestElement#executeReporting#suspend(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestElement.kt:362)
	at de.infix.testBalloon.framework.core.TestSuite#execute#suspend(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:226)
	at de.infix.testBalloon.framework.core.TestElement#execute#suspend(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestElement.kt:338)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.TestSuite$execute$2$invoke$2.TestSuite$execute$2$invoke$2$invoke$2.$invokeCOROUTINE$0.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:240)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.TestSuite$execute$2$invoke$2.TestSuite$execute$2$invoke$2$invoke$2.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:236)
	at kotlin.Function2#invoke(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at kotlinx.coroutines.intrinsics.startUndspatched#internal(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/common/src/intrinsics/Undispatched.kt:66)
	at kotlinx.coroutines.intrinsics#startUndispatchedOrReturn__at__kotlinx.coroutines.internal.ScopeCoroutine<0:0>(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/common/src/intrinsics/Undispatched.kt:43)
	at kotlinx.coroutines#coroutineScope#suspend(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/common/src/CoroutineScope.kt:286)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.TestSuite$execute$2$invoke$2.$invokeCOROUTINE$1.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:236)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.TestSuite$execute$2$invoke$2.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:229)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.TestConfig.TestConfig$executeWrapped$invocationGuardingAction$1.$invokeCOROUTINE$1.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:115)
	at de.infix.testBalloon.framework.core.TestConfig.TestConfig$executeWrapped$invocationGuardingAction$1.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:114)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.TestConfig.TestConfig$executeWrapped$$inlined$wrapIfNotNull$1.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:441)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$suiteLifecycleAction$1.$invokeCOROUTINE$4.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:288)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$suiteLifecycleAction$1.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:282)
	at kotlin.coroutines.SuspendFunction2#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.TestConfig.$executeWrappedCOROUTINE$3.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:124)
	at de.infix.testBalloon.framework.core.TestConfig#executeWrapped#suspend(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:109)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.$invokeCOROUTINE$2.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:229)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:226)
	at kotlin.coroutines.SuspendFunction0#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.TestElement.TestElement$executeReporting$2.$invokeCOROUTINE$0.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestElement.kt:375)
	at de.infix.testBalloon.framework.core.TestElement.TestElement$executeReporting$2.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestElement.kt:362)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.TestConfig.$withExecutionReportSetupCOROUTINE$4.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:143)
	at de.infix.testBalloon.framework.core.TestConfig#withExecutionReportSetup#suspend(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:134)
	at de.infix.testBalloon.framework.core.TestElement#executeReporting#suspend(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestElement.kt:362)
	at de.infix.testBalloon.framework.core.TestSuite#execute#suspend(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:226)
	at de.infix.testBalloon.framework.core.TestElement#execute#suspend(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestElement.kt:338)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.TestSuite$execute$2$invoke$2.TestSuite$execute$2$invoke$2$invoke$2.$invokeCOROUTINE$0.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:240)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.TestSuite$execute$2$invoke$2.TestSuite$execute$2$invoke$2$invoke$2.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:236)
	at kotlin.Function2#invoke(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at kotlinx.coroutines.intrinsics.startUndspatched#internal(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/common/src/intrinsics/Undispatched.kt:66)
	at kotlinx.coroutines.intrinsics#startUndispatchedOrReturn__at__kotlinx.coroutines.internal.ScopeCoroutine<0:0>(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/common/src/intrinsics/Undispatched.kt:43)
	at kotlinx.coroutines#coroutineScope#suspend(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/common/src/CoroutineScope.kt:286)

```

</blockquote>

</details>

<details >
<summary >❌

 `wrap address` on iosSimulatorArm64 failed after 1ms


</summary>
<blockquote >

| Name | Platform | Failure |
| :--- | :--- | :--- | 
| wrap address ❌ | iosSimulatorArm64 | kotlin.AssertionError: -103 should not equal -103 |
```log
kotlin.AssertionError: -103 should not equal -103
	at kotlin.Error#<init>(/opt/buildAgent/work/2886554ce455f6e1/kotlin/kotlin-native/runtime/src/main/kotlin/kotlin/Exceptions.kt:14)
	at kotlin.AssertionError#<init>(/opt/buildAgent/work/2886554ce455f6e1/kotlin/kotlin-native/runtime/src/main/kotlin/kotlin/Exceptions.kt:129)
	at io.kotest.assertions.Exceptions#createAssertionError(/Users/runner/work/kotest/kotest/kotest-assertions/kotest-assertions-shared/src/desktopMain/kotlin/io/kotest/assertions/Exceptions.kt:10)
	at io.kotest.assertions#failure(/Users/runner/work/kotest/kotest/kotest-assertions/kotest-assertions-shared/src/commonMain/kotlin/io/kotest/assertions/failures.kt:33)
	at io.kotest.assertions#failure(/Users/runner/work/kotest/kotest/kotest-assertions/kotest-assertions-shared/src/commonMain/kotlin/io/kotest/assertions/failures.kt:23)
	at io.kotest.matchers#invokeMatcher(/Users/runner/work/kotest/kotest/kotest-assertions/kotest-assertions-shared/src/commonMain/kotlin/io/kotest/matchers/should.kt:59)
	at io.kotest.matchers#should__at__0:0(/Users/runner/work/kotest/kotest/kotest-assertions/kotest-assertions-shared/src/commonMain/kotlin/io/kotest/matchers/should.kt:33)
	at io.kotest.matchers#shouldNot__at__0:0(/Users/runner/work/kotest/kotest/kotest-assertions/kotest-assertions-shared/src/commonMain/kotlin/io/kotest/matchers/should.kt:66)
	at io.kotest.matchers#shouldNotBe__at__0:0(/Users/runner/work/kotest/kotest/kotest-assertions/kotest-assertions-shared/src/commonMain/kotlin/io/kotest/matchers/should.kt:26)
	at com.dshatz.kni.buffers.NativeBufferTest$2.NativeBufferTest$2$invoke$3.invoke#internal(/Users/runner/work/Kotlin-JNI/Kotlin-JNI/buffers/src/nativeTest/kotlin/com/dshatz/kni/buffers/NativeBufferTest.kt:72)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.Test.Test$executeInTestScope$2.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/Test.kt:106)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.internal.runTestAwaitingCompletion$2.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/nativeMain/kotlin/de/infix/testBalloon/framework/core/internal/TestFramework.native.kt:43)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at kotlinx.coroutines.test.runTest$$inlined$let$1.runTest$$inlined$let$1$invoke$2.$invokeCOROUTINE$0.invokeSuspend#internal(/opt/buildAgent/work/2886554ce455f6e1/kotlin/libraries/stdlib/src/kotlin/util/Standard.kt:166)
	at kotlin.coroutines.native.internal.BaseContinuationImpl#invokeSuspend(/opt/buildAgent/work/2886554ce455f6e1/kotlin/kotlin-native/runtime/src/main/kotlin/kotlin/coroutines/ContinuationImpl.kt:50)
	at kotlin.coroutines.native.internal.BaseContinuationImpl#resumeWith(/opt/buildAgent/work/2886554ce455f6e1/kotlin/kotlin-native/runtime/src/main/kotlin/kotlin/coroutines/ContinuationImpl.kt:30)
	at kotlin.coroutines.Continuation#resumeWith(/opt/buildAgent/work/2886554ce455f6e1/kotlin/libraries/stdlib/src/kotlin/coroutines/Continuation.kt:26)
	at kotlinx.coroutines.DispatchedTask#run(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/common/src/internal/DispatchedTask.kt:100)
	at kotlinx.coroutines.Runnable#run(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/native/src/Runnable.kt:12)
	at kotlinx.coroutines.test.TestDispatcher#processEvent(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-test/common/src/TestDispatcher.kt:24)
	at kotlinx.coroutines.test.TestCoroutineScheduler#tryRunNextTaskUnless(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-test/common/src/TestCoroutineScheduler.kt:99)
	at kotlinx.coroutines.test.runTest$$inlined$let$1.runTest$$inlined$let$1$invoke$3.$invokeCOROUTINE$1.invokeSuspend#internal(/opt/buildAgent/work/2886554ce455f6e1/kotlin/libraries/stdlib/src/kotlin/util/Standard.kt:166)
	at kotlinx.coroutines.test.runTest$$inlined$let$1.runTest$$inlined$let$1$invoke$3.invoke#internal(/opt/buildAgent/work/2886554ce455f6e1/kotlin/libraries/stdlib/src/kotlin/util/Standard.kt:166)
	at kotlin.Function2#invoke(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at kotlin.coroutines.intrinsics.createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$2.invokeSuspend#internal(/opt/buildAgent/work/2886554ce455f6e1/kotlin/kotlin-native/runtime/src/main/kotlin/kotlin/coroutines/intrinsics/IntrinsicsNative.kt:254)
	at kotlin.coroutines.native.internal.BaseContinuationImpl#invokeSuspend(/opt/buildAgent/work/2886554ce455f6e1/kotlin/kotlin-native/runtime/src/main/kotlin/kotlin/coroutines/ContinuationImpl.kt:50)
	at kotlin.coroutines.native.internal.BaseContinuationImpl#resumeWith(/opt/buildAgent/work/2886554ce455f6e1/kotlin/kotlin-native/runtime/src/main/kotlin/kotlin/coroutines/ContinuationImpl.kt:30)
	at kotlin.coroutines.Continuation#resumeWith(/opt/buildAgent/work/2886554ce455f6e1/kotlin/libraries/stdlib/src/kotlin/coroutines/Continuation.kt:26)
	at kotlinx.coroutines.DispatchedTask#run(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/common/src/internal/DispatchedTask.kt:100)
	at kotlinx.coroutines.Runnable#run(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/native/src/Runnable.kt:12)
	at kotlinx.coroutines.EventLoopImplBase#processNextEvent(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/common/src/EventLoop.common.kt:263)
	at kotlinx.coroutines.EventLoop#processNextEvent(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/common/src/EventLoop.common.kt:49)
	at kotlinx.coroutines.BlockingCoroutine.joinBlocking#internal(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/native/src/Builders.kt:131)
	at kotlinx.coroutines#runBlocking(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/native/src/Builders.kt:70)
	at kotlinx.coroutines#runBlocking$default(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/native/src/Builders.kt:47)
	at kotlinx.coroutines.test#createTestResult(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-test/native/src/TestBuilders.kt:7)
	at kotlinx.coroutines.test#runTest__at__kotlinx.coroutines.test.TestScope(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-test/common/src/TestBuilders.kt:309)
	at de.infix.testBalloon.framework.core.internal#runTestAwaitingCompletion#suspend__at__kotlinx.coroutines.test.TestScope(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/nativeMain/kotlin/de/infix/testBalloon/framework/core/internal/TestFramework.native.kt:43)
	at de.infix.testBalloon.framework.core.Test.$executeInTestScopeCOROUTINE$1.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/Test.kt:100)
	at de.infix.testBalloon.framework.core.Test.executeInTestScope#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/Test.kt:98)
	at de.infix.testBalloon.framework.core.Test.Test$execute$2.Test$execute$2$invoke$2.$invokeCOROUTINE$0.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/Test.kt:83)
	at de.infix.testBalloon.framework.core.Test.Test$execute$2.Test$execute$2$invoke$2.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/Test.kt:69)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.TestConfig.TestConfig$executeWrapped$invocationGuardingAction$1.$invokeCOROUTINE$1.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:115)
	at de.infix.testBalloon.framework.core.TestConfig.TestConfig$executeWrapped$invocationGuardingAction$1.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:114)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.TestConfig.$executeWrappedCOROUTINE$3.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:124)
	at de.infix.testBalloon.framework.core.TestConfig#executeWrapped#suspend(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:109)
	at de.infix.testBalloon.framework.core.Test.Test$execute$2.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/Test.kt:69)
	at kotlin.coroutines.SuspendFunction0#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.TestElement.TestElement$executeReporting$2.$invokeCOROUTINE$0.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestElement.kt:375)
	at de.infix.testBalloon.framework.core.TestElement.TestElement$executeReporting$2.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestElement.kt:362)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.TestConfig.$withExecutionReportSetupCOROUTINE$4.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:143)
	at de.infix.testBalloon.framework.core.TestConfig#withExecutionReportSetup#suspend(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:134)
	at de.infix.testBalloon.framework.core.TestElement#executeReporting#suspend(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestElement.kt:362)
	at de.infix.testBalloon.framework.core.Test#execute#suspend(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/Test.kt:66)
	at de.infix.testBalloon.framework.core.TestElement#execute#suspend(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestElement.kt:338)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.TestSuite$execute$2$invoke$2.TestSuite$execute$2$invoke$2$invoke$2.$invokeCOROUTINE$0.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:240)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.TestSuite$execute$2$invoke$2.TestSuite$execute$2$invoke$2$invoke$2.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:236)
	at kotlin.Function2#invoke(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at kotlinx.coroutines.intrinsics.startUndspatched#internal(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/common/src/intrinsics/Undispatched.kt:66)
	at kotlinx.coroutines.intrinsics#startUndispatchedOrReturn__at__kotlinx.coroutines.internal.ScopeCoroutine<0:0>(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/common/src/intrinsics/Undispatched.kt:43)
	at kotlinx.coroutines#coroutineScope#suspend(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/common/src/CoroutineScope.kt:286)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.TestSuite$execute$2$invoke$2.$invokeCOROUTINE$1.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:236)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.TestSuite$execute$2$invoke$2.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:229)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.TestConfig.TestConfig$executeWrapped$invocationGuardingAction$1.$invokeCOROUTINE$1.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:115)
	at de.infix.testBalloon.framework.core.TestConfig.TestConfig$executeWrapped$invocationGuardingAction$1.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:114)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.TestConfig.TestConfig$executeWrapped$$inlined$wrapIfNotNull$1.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:441)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$suiteLifecycleAction$1.$invokeCOROUTINE$4.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:288)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$suiteLifecycleAction$1.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:282)
	at kotlin.coroutines.SuspendFunction2#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.TestConfig.$executeWrappedCOROUTINE$3.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:124)
	at de.infix.testBalloon.framework.core.TestConfig#executeWrapped#suspend(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:109)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.$invokeCOROUTINE$2.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:229)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:226)
	at kotlin.coroutines.SuspendFunction0#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.TestElement.TestElement$executeReporting$2.$invokeCOROUTINE$0.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestElement.kt:375)
	at de.infix.testBalloon.framework.core.TestElement.TestElement$executeReporting$2.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestElement.kt:362)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.TestConfig.$withExecutionReportSetupCOROUTINE$4.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:143)
	at de.infix.testBalloon.framework.core.TestConfig#withExecutionReportSetup#suspend(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:134)
	at de.infix.testBalloon.framework.core.TestElement#executeReporting#suspend(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestElement.kt:362)
	at de.infix.testBalloon.framework.core.TestSuite#execute#suspend(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:226)
	at de.infix.testBalloon.framework.core.TestElement#execute#suspend(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestElement.kt:338)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.TestSuite$execute$2$invoke$2.TestSuite$execute$2$invoke$2$invoke$2.$invokeCOROUTINE$0.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:240)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.TestSuite$execute$2$invoke$2.TestSuite$execute$2$invoke$2$invoke$2.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:236)
	at kotlin.Function2#invoke(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at kotlinx.coroutines.intrinsics.startUndspatched#internal(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/common/src/intrinsics/Undispatched.kt:66)
	at kotlinx.coroutines.intrinsics#startUndispatchedOrReturn__at__kotlinx.coroutines.internal.ScopeCoroutine<0:0>(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/common/src/intrinsics/Undispatched.kt:43)
	at kotlinx.coroutines#coroutineScope#suspend(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/common/src/CoroutineScope.kt:286)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.TestSuite$execute$2$invoke$2.$invokeCOROUTINE$1.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:236)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.TestSuite$execute$2$invoke$2.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:229)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.TestConfig.TestConfig$executeWrapped$invocationGuardingAction$1.$invokeCOROUTINE$1.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:115)
	at de.infix.testBalloon.framework.core.TestConfig.TestConfig$executeWrapped$invocationGuardingAction$1.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:114)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.TestConfig.TestConfig$executeWrapped$$inlined$wrapIfNotNull$1.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:441)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$suiteLifecycleAction$1.$invokeCOROUTINE$4.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:288)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$suiteLifecycleAction$1.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:282)
	at kotlin.coroutines.SuspendFunction2#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.TestConfig.$executeWrappedCOROUTINE$3.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:124)
	at de.infix.testBalloon.framework.core.TestConfig#executeWrapped#suspend(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:109)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.$invokeCOROUTINE$2.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:229)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:226)
	at kotlin.coroutines.SuspendFunction0#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.TestElement.TestElement$executeReporting$2.$invokeCOROUTINE$0.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestElement.kt:375)
	at de.infix.testBalloon.framework.core.TestElement.TestElement$executeReporting$2.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestElement.kt:362)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.TestConfig.$withExecutionReportSetupCOROUTINE$4.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:143)
	at de.infix.testBalloon.framework.core.TestConfig#withExecutionReportSetup#suspend(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:134)
	at de.infix.testBalloon.framework.core.TestElement#executeReporting#suspend(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestElement.kt:362)
	at de.infix.testBalloon.framework.core.TestSuite#execute#suspend(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:226)
	at de.infix.testBalloon.framework.core.TestElement#execute#suspend(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestElement.kt:338)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.TestSuite$execute$2$invoke$2.TestSuite$execute$2$invoke$2$invoke$2.$invokeCOROUTINE$0.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:240)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.TestSuite$execute$2$invoke$2.TestSuite$execute$2$invoke$2$invoke$2.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:236)
	at kotlin.Function2#invoke(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at kotlinx.coroutines.intrinsics.startUndspatched#internal(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/common/src/intrinsics/Undispatched.kt:66)
	at kotlinx.coroutines.intrinsics#startUndispatchedOrReturn__at__kotlinx.coroutines.internal.ScopeCoroutine<0:0>(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/common/src/intrinsics/Undispatched.kt:43)
	at kotlinx.coroutines#coroutineScope#suspend(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/common/src/CoroutineScope.kt:286)

```

</blockquote>

</details>

<details >
<summary >❌

 `wrap address` on macosArm64 failed after 0s


</summary>
<blockquote >

| Name | Platform | Failure |
| :--- | :--- | :--- | 
| wrap address ❌ | macosArm64 | kotlin.AssertionError: -103 should not equal -103 |
```log
kotlin.AssertionError: -103 should not equal -103
	at kotlin.Error#<init>(/opt/buildAgent/work/2886554ce455f6e1/kotlin/kotlin-native/runtime/src/main/kotlin/kotlin/Exceptions.kt:14)
	at kotlin.AssertionError#<init>(/opt/buildAgent/work/2886554ce455f6e1/kotlin/kotlin-native/runtime/src/main/kotlin/kotlin/Exceptions.kt:129)
	at io.kotest.assertions.Exceptions#createAssertionError(/Users/runner/work/kotest/kotest/kotest-assertions/kotest-assertions-shared/src/desktopMain/kotlin/io/kotest/assertions/Exceptions.kt:10)
	at io.kotest.assertions#failure(/Users/runner/work/kotest/kotest/kotest-assertions/kotest-assertions-shared/src/commonMain/kotlin/io/kotest/assertions/failures.kt:33)
	at io.kotest.assertions#failure(/Users/runner/work/kotest/kotest/kotest-assertions/kotest-assertions-shared/src/commonMain/kotlin/io/kotest/assertions/failures.kt:23)
	at io.kotest.matchers#invokeMatcher(/Users/runner/work/kotest/kotest/kotest-assertions/kotest-assertions-shared/src/commonMain/kotlin/io/kotest/matchers/should.kt:59)
	at io.kotest.matchers#should__at__0:0(/Users/runner/work/kotest/kotest/kotest-assertions/kotest-assertions-shared/src/commonMain/kotlin/io/kotest/matchers/should.kt:33)
	at io.kotest.matchers#shouldNot__at__0:0(/Users/runner/work/kotest/kotest/kotest-assertions/kotest-assertions-shared/src/commonMain/kotlin/io/kotest/matchers/should.kt:66)
	at io.kotest.matchers#shouldNotBe__at__0:0(/Users/runner/work/kotest/kotest/kotest-assertions/kotest-assertions-shared/src/commonMain/kotlin/io/kotest/matchers/should.kt:26)
	at com.dshatz.kni.buffers.NativeBufferTest$2.NativeBufferTest$2$invoke$3.invoke#internal(/Users/runner/work/Kotlin-JNI/Kotlin-JNI/buffers/src/nativeTest/kotlin/com/dshatz/kni/buffers/NativeBufferTest.kt:72)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.Test.Test$executeInTestScope$2.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/Test.kt:106)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.internal.runTestAwaitingCompletion$2.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/nativeMain/kotlin/de/infix/testBalloon/framework/core/internal/TestFramework.native.kt:43)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at kotlinx.coroutines.test.runTest$$inlined$let$1.runTest$$inlined$let$1$invoke$2.$invokeCOROUTINE$0.invokeSuspend#internal(/opt/buildAgent/work/2886554ce455f6e1/kotlin/libraries/stdlib/src/kotlin/util/Standard.kt:166)
	at kotlin.coroutines.native.internal.BaseContinuationImpl#invokeSuspend(/opt/buildAgent/work/2886554ce455f6e1/kotlin/kotlin-native/runtime/src/main/kotlin/kotlin/coroutines/ContinuationImpl.kt:50)
	at kotlin.coroutines.native.internal.BaseContinuationImpl#resumeWith(/opt/buildAgent/work/2886554ce455f6e1/kotlin/kotlin-native/runtime/src/main/kotlin/kotlin/coroutines/ContinuationImpl.kt:30)
	at kotlin.coroutines.Continuation#resumeWith(/opt/buildAgent/work/2886554ce455f6e1/kotlin/libraries/stdlib/src/kotlin/coroutines/Continuation.kt:26)
	at kotlinx.coroutines.DispatchedTask#run(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/common/src/internal/DispatchedTask.kt:100)
	at kotlinx.coroutines.Runnable#run(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/native/src/Runnable.kt:12)
	at kotlinx.coroutines.test.TestDispatcher#processEvent(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-test/common/src/TestDispatcher.kt:24)
	at kotlinx.coroutines.test.TestCoroutineScheduler#tryRunNextTaskUnless(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-test/common/src/TestCoroutineScheduler.kt:99)
	at kotlinx.coroutines.test.runTest$$inlined$let$1.runTest$$inlined$let$1$invoke$3.$invokeCOROUTINE$1.invokeSuspend#internal(/opt/buildAgent/work/2886554ce455f6e1/kotlin/libraries/stdlib/src/kotlin/util/Standard.kt:166)
	at kotlinx.coroutines.test.runTest$$inlined$let$1.runTest$$inlined$let$1$invoke$3.invoke#internal(/opt/buildAgent/work/2886554ce455f6e1/kotlin/libraries/stdlib/src/kotlin/util/Standard.kt:166)
	at kotlin.Function2#invoke(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at kotlin.coroutines.intrinsics.createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$2.invokeSuspend#internal(/opt/buildAgent/work/2886554ce455f6e1/kotlin/kotlin-native/runtime/src/main/kotlin/kotlin/coroutines/intrinsics/IntrinsicsNative.kt:254)
	at kotlin.coroutines.native.internal.BaseContinuationImpl#invokeSuspend(/opt/buildAgent/work/2886554ce455f6e1/kotlin/kotlin-native/runtime/src/main/kotlin/kotlin/coroutines/ContinuationImpl.kt:50)
	at kotlin.coroutines.native.internal.BaseContinuationImpl#resumeWith(/opt/buildAgent/work/2886554ce455f6e1/kotlin/kotlin-native/runtime/src/main/kotlin/kotlin/coroutines/ContinuationImpl.kt:30)
	at kotlin.coroutines.Continuation#resumeWith(/opt/buildAgent/work/2886554ce455f6e1/kotlin/libraries/stdlib/src/kotlin/coroutines/Continuation.kt:26)
	at kotlinx.coroutines.DispatchedTask#run(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/common/src/internal/DispatchedTask.kt:100)
	at kotlinx.coroutines.Runnable#run(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/native/src/Runnable.kt:12)
	at kotlinx.coroutines.EventLoopImplBase#processNextEvent(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/common/src/EventLoop.common.kt:263)
	at kotlinx.coroutines.EventLoop#processNextEvent(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/common/src/EventLoop.common.kt:49)
	at kotlinx.coroutines.BlockingCoroutine.joinBlocking#internal(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/native/src/Builders.kt:131)
	at kotlinx.coroutines#runBlocking(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/native/src/Builders.kt:70)
	at kotlinx.coroutines#runBlocking$default(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/native/src/Builders.kt:47)
	at kotlinx.coroutines.test#createTestResult(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-test/native/src/TestBuilders.kt:7)
	at kotlinx.coroutines.test#runTest__at__kotlinx.coroutines.test.TestScope(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-test/common/src/TestBuilders.kt:309)
	at de.infix.testBalloon.framework.core.internal#runTestAwaitingCompletion#suspend__at__kotlinx.coroutines.test.TestScope(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/nativeMain/kotlin/de/infix/testBalloon/framework/core/internal/TestFramework.native.kt:43)
	at de.infix.testBalloon.framework.core.Test.$executeInTestScopeCOROUTINE$1.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/Test.kt:100)
	at de.infix.testBalloon.framework.core.Test.executeInTestScope#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/Test.kt:98)
	at de.infix.testBalloon.framework.core.Test.Test$execute$2.Test$execute$2$invoke$2.$invokeCOROUTINE$0.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/Test.kt:83)
	at de.infix.testBalloon.framework.core.Test.Test$execute$2.Test$execute$2$invoke$2.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/Test.kt:69)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.TestConfig.TestConfig$executeWrapped$invocationGuardingAction$1.$invokeCOROUTINE$1.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:115)
	at de.infix.testBalloon.framework.core.TestConfig.TestConfig$executeWrapped$invocationGuardingAction$1.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:114)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.TestConfig.$executeWrappedCOROUTINE$3.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:124)
	at de.infix.testBalloon.framework.core.TestConfig#executeWrapped#suspend(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:109)
	at de.infix.testBalloon.framework.core.Test.Test$execute$2.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/Test.kt:69)
	at kotlin.coroutines.SuspendFunction0#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.TestElement.TestElement$executeReporting$2.$invokeCOROUTINE$0.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestElement.kt:375)
	at de.infix.testBalloon.framework.core.TestElement.TestElement$executeReporting$2.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestElement.kt:362)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.TestConfig.$withExecutionReportSetupCOROUTINE$4.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:143)
	at de.infix.testBalloon.framework.core.TestConfig#withExecutionReportSetup#suspend(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:134)
	at de.infix.testBalloon.framework.core.TestElement#executeReporting#suspend(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestElement.kt:362)
	at de.infix.testBalloon.framework.core.Test#execute#suspend(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/Test.kt:66)
	at de.infix.testBalloon.framework.core.TestElement#execute#suspend(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestElement.kt:338)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.TestSuite$execute$2$invoke$2.TestSuite$execute$2$invoke$2$invoke$2.$invokeCOROUTINE$0.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:240)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.TestSuite$execute$2$invoke$2.TestSuite$execute$2$invoke$2$invoke$2.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:236)
	at kotlin.Function2#invoke(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at kotlinx.coroutines.intrinsics.startUndspatched#internal(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/common/src/intrinsics/Undispatched.kt:66)
	at kotlinx.coroutines.intrinsics#startUndispatchedOrReturn__at__kotlinx.coroutines.internal.ScopeCoroutine<0:0>(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/common/src/intrinsics/Undispatched.kt:43)
	at kotlinx.coroutines#coroutineScope#suspend(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/common/src/CoroutineScope.kt:286)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.TestSuite$execute$2$invoke$2.$invokeCOROUTINE$1.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:236)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.TestSuite$execute$2$invoke$2.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:229)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.TestConfig.TestConfig$executeWrapped$invocationGuardingAction$1.$invokeCOROUTINE$1.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:115)
	at de.infix.testBalloon.framework.core.TestConfig.TestConfig$executeWrapped$invocationGuardingAction$1.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:114)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.TestConfig.TestConfig$executeWrapped$$inlined$wrapIfNotNull$1.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:441)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$suiteLifecycleAction$1.$invokeCOROUTINE$4.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:288)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$suiteLifecycleAction$1.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:282)
	at kotlin.coroutines.SuspendFunction2#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.TestConfig.$executeWrappedCOROUTINE$3.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:124)
	at de.infix.testBalloon.framework.core.TestConfig#executeWrapped#suspend(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:109)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.$invokeCOROUTINE$2.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:229)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:226)
	at kotlin.coroutines.SuspendFunction0#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.TestElement.TestElement$executeReporting$2.$invokeCOROUTINE$0.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestElement.kt:375)
	at de.infix.testBalloon.framework.core.TestElement.TestElement$executeReporting$2.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestElement.kt:362)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.TestConfig.$withExecutionReportSetupCOROUTINE$4.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:143)
	at de.infix.testBalloon.framework.core.TestConfig#withExecutionReportSetup#suspend(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:134)
	at de.infix.testBalloon.framework.core.TestElement#executeReporting#suspend(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestElement.kt:362)
	at de.infix.testBalloon.framework.core.TestSuite#execute#suspend(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:226)
	at de.infix.testBalloon.framework.core.TestElement#execute#suspend(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestElement.kt:338)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.TestSuite$execute$2$invoke$2.TestSuite$execute$2$invoke$2$invoke$2.$invokeCOROUTINE$0.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:240)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.TestSuite$execute$2$invoke$2.TestSuite$execute$2$invoke$2$invoke$2.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:236)
	at kotlin.Function2#invoke(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at kotlinx.coroutines.intrinsics.startUndspatched#internal(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/common/src/intrinsics/Undispatched.kt:66)
	at kotlinx.coroutines.intrinsics#startUndispatchedOrReturn__at__kotlinx.coroutines.internal.ScopeCoroutine<0:0>(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/common/src/intrinsics/Undispatched.kt:43)
	at kotlinx.coroutines#coroutineScope#suspend(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/common/src/CoroutineScope.kt:286)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.TestSuite$execute$2$invoke$2.$invokeCOROUTINE$1.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:236)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.TestSuite$execute$2$invoke$2.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:229)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.TestConfig.TestConfig$executeWrapped$invocationGuardingAction$1.$invokeCOROUTINE$1.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:115)
	at de.infix.testBalloon.framework.core.TestConfig.TestConfig$executeWrapped$invocationGuardingAction$1.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:114)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.TestConfig.TestConfig$executeWrapped$$inlined$wrapIfNotNull$1.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:441)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$suiteLifecycleAction$1.$invokeCOROUTINE$4.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:288)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$suiteLifecycleAction$1.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:282)
	at kotlin.coroutines.SuspendFunction2#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.TestConfig.$executeWrappedCOROUTINE$3.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:124)
	at de.infix.testBalloon.framework.core.TestConfig#executeWrapped#suspend(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:109)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.$invokeCOROUTINE$2.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:229)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:226)
	at kotlin.coroutines.SuspendFunction0#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.TestElement.TestElement$executeReporting$2.$invokeCOROUTINE$0.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestElement.kt:375)
	at de.infix.testBalloon.framework.core.TestElement.TestElement$executeReporting$2.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestElement.kt:362)
	at kotlin.coroutines.SuspendFunction1#invoke#suspend(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at de.infix.testBalloon.framework.core.TestConfig.$withExecutionReportSetupCOROUTINE$4.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:143)
	at de.infix.testBalloon.framework.core.TestConfig#withExecutionReportSetup#suspend(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestConfig.kt:134)
	at de.infix.testBalloon.framework.core.TestElement#executeReporting#suspend(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestElement.kt:362)
	at de.infix.testBalloon.framework.core.TestSuite#execute#suspend(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:226)
	at de.infix.testBalloon.framework.core.TestElement#execute#suspend(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestElement.kt:338)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.TestSuite$execute$2$invoke$2.TestSuite$execute$2$invoke$2$invoke$2.$invokeCOROUTINE$0.invokeSuspend#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:240)
	at de.infix.testBalloon.framework.core.TestSuite.TestSuite$execute$2.TestSuite$execute$2$invoke$2.TestSuite$execute$2$invoke$2$invoke$2.invoke#internal(/Users/runner/work/testBalloon/testBalloon/testBalloon-framework-core/src/commonMain/kotlin/de/infix/testBalloon/framework/core/TestSuite.kt:236)
	at kotlin.Function2#invoke(/Users/runner/.gradle/daemon/8.14.4/[K][Suspend]Functions:1)
	at kotlinx.coroutines.intrinsics.startUndspatched#internal(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/common/src/intrinsics/Undispatched.kt:66)
	at kotlinx.coroutines.intrinsics#startUndispatchedOrReturn__at__kotlinx.coroutines.internal.ScopeCoroutine<0:0>(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/common/src/intrinsics/Undispatched.kt:43)
	at kotlinx.coroutines#coroutineScope#suspend(/opt/buildAgent/work/44ec6e850d5c63f0/kotlinx-coroutines-core/common/src/CoroutineScope.kt:286)

```

</blockquote>

</details>

## BufferTest

| Name | linuxX64 |
| :--- | :--- | 
| write read | ✅ 0s |
| release | ✅ 1ms |
| allocate negative size | ✅ 1ms |
| read out of bounds | ✅ 0s |
| read overflow destination | ✅ 1ms |
| read from negative offset | ✅ 1ms |
| write negative offset | ✅ 25ms |
| write past end | ✅ 23ms |
### ✅ 8 tests passed
## NativeBufferTest

| Name | linuxX64 |
| :--- | :--- | 
| release native heap | ✅ 1ms |
| wrap ByteArray | ✅ 0s |
| wrap address | ✅ 0s |
### ✅ 3 tests passed
