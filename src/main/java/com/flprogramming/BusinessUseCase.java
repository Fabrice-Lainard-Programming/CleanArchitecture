/*--------------------------------------------------------------------------
* Project: Clean Architecture
* Author Fabrice Lainard Created : 18/01/2020
*
* Copyright (c) Fabtice Lainard Programming. All rights reserved.
* Licensed under the MIT License.
--------------------------------------------------------------------------*/

package com.flprogramming;

 

/**
 * Clean Architecture : Business Use case
 * @author lainard
 */
public class BusinessUseCase implements UseCase<Long,Long> {

    OutputPort<Long> outPort;
    
    BusinessUseCase(OutputPort<Long> outPort)
    {
        this.outPort = outPort;
    }
  
    
    @Override
    public void execute(Long id) throws Exception {
  
        // Do stuff with the given id:
        Long value = id+1; // complex use case ! :)
        // call the ouput port and do not return value !
        outPort.onExecuted(value);
        
    }
 
    
}
