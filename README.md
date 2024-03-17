Coroutines usage and representations: 

Async-Dispatchers-Job-Scope-Suspend-withContext

Async:
A function that launches a new coroutine without blocking the current thread and returns a Deferred<T>,
which represents a promise to provide a result of type T in the future. 
It allows you to perform asynchronous operations.


Dispatchers:
Dispatchers provide context for coroutines to execute on specific threads.
They determine which thread or thread pool the coroutine runs on. 
Examples include Dispatchers.Main, Dispatchers.IO, and Dispatchers.Default.

Job:

A Job represents a cancellable piece of work.
It is returned by coroutine builders such as launch and async. 
Jobs can be used to manage and cancel coroutines.

Scope:

A CoroutineScope is an interface that provides a structured concurrency mechanism for coroutines. 
It defines the lifetime of coroutines and manages their cancellation.
It's often used to launch coroutines in a structured way and to handle exceptions.

Suspend:
The suspend modifier is used in coroutine functions to indicate that the function can be suspended without blocking the thread. 
Suspending functions can be used to perform long-running or asynchronous operations without blocking the thread.

withContext:
-withContext is a coroutine builder that allows you to switch the context (Dispatcher) of a coroutine.
It suspends the current coroutine, switches to the specified context, executes the block of code, and then returns to the original context.
It's commonly used to perform operations on different threads without blocking.
