/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.autoscaling;

import com.amazonaws.services.autoscaling.model.*;

/**
 * Interface for accessing Auto Scaling asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>Auto Scaling</fullname>
 * <p>
 * Auto Scaling is designed to automatically launch or terminate EC2 instances based on user-defined policies,
 * schedules, and health checks. Use this service in conjunction with the Amazon CloudWatch and Elastic Load Balancing
 * services.
 * </p>
 */
public interface AmazonAutoScalingAsync extends AmazonAutoScaling {

    /**
     * <p>
     * Attaches one or more EC2 instances to the specified Auto Scaling group.
     * </p>
     * <p>
     * When you attach instances, Auto Scaling increases the desired capacity of the group by the number of instances
     * being attached. If the number of instances being attached plus the desired capacity of the group exceeds the
     * maximum size of the group, the operation fails.
     * </p>
     * <p>
     * If there is a Classic load balancer attached to your Auto Scaling group, the instances are also registered with
     * the load balancer. If there are target groups attached to your Auto Scaling group, the instances are also
     * registered with the target groups.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/attach-instance-asg.html">Attach EC2 Instances
     * to Your Auto Scaling Group</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param attachInstancesRequest
     *        Contains the parameters for AttachInstances.
     * @return A Java Future containing the result of the AttachInstances operation returned by the service.
     * @sample AmazonAutoScalingAsync.AttachInstances
     */
    java.util.concurrent.Future<AttachInstancesResult> attachInstancesAsync(AttachInstancesRequest attachInstancesRequest);

    /**
     * <p>
     * Attaches one or more EC2 instances to the specified Auto Scaling group.
     * </p>
     * <p>
     * When you attach instances, Auto Scaling increases the desired capacity of the group by the number of instances
     * being attached. If the number of instances being attached plus the desired capacity of the group exceeds the
     * maximum size of the group, the operation fails.
     * </p>
     * <p>
     * If there is a Classic load balancer attached to your Auto Scaling group, the instances are also registered with
     * the load balancer. If there are target groups attached to your Auto Scaling group, the instances are also
     * registered with the target groups.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/attach-instance-asg.html">Attach EC2 Instances
     * to Your Auto Scaling Group</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param attachInstancesRequest
     *        Contains the parameters for AttachInstances.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AttachInstances operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.AttachInstances
     */
    java.util.concurrent.Future<AttachInstancesResult> attachInstancesAsync(AttachInstancesRequest attachInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<AttachInstancesRequest, AttachInstancesResult> asyncHandler);

    /**
     * <p>
     * Attaches one or more target groups to the specified Auto Scaling group.
     * </p>
     * <p>
     * To describe the target groups for an Auto Scaling group, use <a>DescribeLoadBalancerTargetGroups</a>. To detach
     * the target group from the Auto Scaling group, use <a>DetachLoadBalancerTargetGroups</a>.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/attach-load-balancer-asg.html">Attach a Load
     * Balancer to Your Auto Scaling Group</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param attachLoadBalancerTargetGroupsRequest
     *        Contains the parameters for AttachLoadBalancerTargetGroups.
     * @return A Java Future containing the result of the AttachLoadBalancerTargetGroups operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsync.AttachLoadBalancerTargetGroups
     */
    java.util.concurrent.Future<AttachLoadBalancerTargetGroupsResult> attachLoadBalancerTargetGroupsAsync(
            AttachLoadBalancerTargetGroupsRequest attachLoadBalancerTargetGroupsRequest);

    /**
     * <p>
     * Attaches one or more target groups to the specified Auto Scaling group.
     * </p>
     * <p>
     * To describe the target groups for an Auto Scaling group, use <a>DescribeLoadBalancerTargetGroups</a>. To detach
     * the target group from the Auto Scaling group, use <a>DetachLoadBalancerTargetGroups</a>.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/attach-load-balancer-asg.html">Attach a Load
     * Balancer to Your Auto Scaling Group</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param attachLoadBalancerTargetGroupsRequest
     *        Contains the parameters for AttachLoadBalancerTargetGroups.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AttachLoadBalancerTargetGroups operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsyncHandler.AttachLoadBalancerTargetGroups
     */
    java.util.concurrent.Future<AttachLoadBalancerTargetGroupsResult> attachLoadBalancerTargetGroupsAsync(
            AttachLoadBalancerTargetGroupsRequest attachLoadBalancerTargetGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<AttachLoadBalancerTargetGroupsRequest, AttachLoadBalancerTargetGroupsResult> asyncHandler);

    /**
     * <p>
     * Attaches one or more Classic load balancers to the specified Auto Scaling group.
     * </p>
     * <p>
     * To attach an Application load balancer instead, see <a>AttachLoadBalancerTargetGroups</a>.
     * </p>
     * <p>
     * To describe the load balancers for an Auto Scaling group, use <a>DescribeLoadBalancers</a>. To detach the load
     * balancer from the Auto Scaling group, use <a>DetachLoadBalancers</a>.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/attach-load-balancer-asg.html">Attach a Load
     * Balancer to Your Auto Scaling Group</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param attachLoadBalancersRequest
     *        Contains the parameters for AttachLoadBalancers.
     * @return A Java Future containing the result of the AttachLoadBalancers operation returned by the service.
     * @sample AmazonAutoScalingAsync.AttachLoadBalancers
     */
    java.util.concurrent.Future<AttachLoadBalancersResult> attachLoadBalancersAsync(AttachLoadBalancersRequest attachLoadBalancersRequest);

    /**
     * <p>
     * Attaches one or more Classic load balancers to the specified Auto Scaling group.
     * </p>
     * <p>
     * To attach an Application load balancer instead, see <a>AttachLoadBalancerTargetGroups</a>.
     * </p>
     * <p>
     * To describe the load balancers for an Auto Scaling group, use <a>DescribeLoadBalancers</a>. To detach the load
     * balancer from the Auto Scaling group, use <a>DetachLoadBalancers</a>.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/attach-load-balancer-asg.html">Attach a Load
     * Balancer to Your Auto Scaling Group</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param attachLoadBalancersRequest
     *        Contains the parameters for AttachLoadBalancers.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AttachLoadBalancers operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.AttachLoadBalancers
     */
    java.util.concurrent.Future<AttachLoadBalancersResult> attachLoadBalancersAsync(AttachLoadBalancersRequest attachLoadBalancersRequest,
            com.amazonaws.handlers.AsyncHandler<AttachLoadBalancersRequest, AttachLoadBalancersResult> asyncHandler);

    /**
     * Simplified method form for invoking the AttachLoadBalancers operation.
     *
     * @see #attachLoadBalancersAsync(AttachLoadBalancersRequest)
     */
    java.util.concurrent.Future<AttachLoadBalancersResult> attachLoadBalancersAsync();

    /**
     * Simplified method form for invoking the AttachLoadBalancers operation with an AsyncHandler.
     *
     * @see #attachLoadBalancersAsync(AttachLoadBalancersRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<AttachLoadBalancersResult> attachLoadBalancersAsync(
            com.amazonaws.handlers.AsyncHandler<AttachLoadBalancersRequest, AttachLoadBalancersResult> asyncHandler);

    /**
     * <p>
     * Completes the lifecycle action for the specified token or instance with the specified result.
     * </p>
     * <p>
     * This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:
     * </p>
     * <ol>
     * <li>
     * <p>
     * (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when
     * Auto Scaling launches or terminates instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an
     * Amazon SNS topic. The role allows Auto Scaling to publish lifecycle notifications to the target.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>If you finish before the timeout period ends, complete the lifecycle action.</b>
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingGroupLifecycle.html">Auto Scaling
     * Lifecycle</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param completeLifecycleActionRequest
     *        Contains the parameters for CompleteLifecycleAction.
     * @return A Java Future containing the result of the CompleteLifecycleAction operation returned by the service.
     * @sample AmazonAutoScalingAsync.CompleteLifecycleAction
     */
    java.util.concurrent.Future<CompleteLifecycleActionResult> completeLifecycleActionAsync(CompleteLifecycleActionRequest completeLifecycleActionRequest);

    /**
     * <p>
     * Completes the lifecycle action for the specified token or instance with the specified result.
     * </p>
     * <p>
     * This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:
     * </p>
     * <ol>
     * <li>
     * <p>
     * (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when
     * Auto Scaling launches or terminates instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an
     * Amazon SNS topic. The role allows Auto Scaling to publish lifecycle notifications to the target.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>If you finish before the timeout period ends, complete the lifecycle action.</b>
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingGroupLifecycle.html">Auto Scaling
     * Lifecycle</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param completeLifecycleActionRequest
     *        Contains the parameters for CompleteLifecycleAction.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CompleteLifecycleAction operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.CompleteLifecycleAction
     */
    java.util.concurrent.Future<CompleteLifecycleActionResult> completeLifecycleActionAsync(CompleteLifecycleActionRequest completeLifecycleActionRequest,
            com.amazonaws.handlers.AsyncHandler<CompleteLifecycleActionRequest, CompleteLifecycleActionResult> asyncHandler);

    /**
     * <p>
     * Creates an Auto Scaling group with the specified name and attributes.
     * </p>
     * <p>
     * If you exceed your maximum limit of Auto Scaling groups, which by default is 20 per region, the call fails. For
     * information about viewing and updating this limit, see <a>DescribeAccountLimits</a>.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingGroup.html">Auto Scaling Groups</a>
     * in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param createAutoScalingGroupRequest
     *        Contains the parameters for CreateAutoScalingGroup.
     * @return A Java Future containing the result of the CreateAutoScalingGroup operation returned by the service.
     * @sample AmazonAutoScalingAsync.CreateAutoScalingGroup
     */
    java.util.concurrent.Future<CreateAutoScalingGroupResult> createAutoScalingGroupAsync(CreateAutoScalingGroupRequest createAutoScalingGroupRequest);

    /**
     * <p>
     * Creates an Auto Scaling group with the specified name and attributes.
     * </p>
     * <p>
     * If you exceed your maximum limit of Auto Scaling groups, which by default is 20 per region, the call fails. For
     * information about viewing and updating this limit, see <a>DescribeAccountLimits</a>.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingGroup.html">Auto Scaling Groups</a>
     * in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param createAutoScalingGroupRequest
     *        Contains the parameters for CreateAutoScalingGroup.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAutoScalingGroup operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.CreateAutoScalingGroup
     */
    java.util.concurrent.Future<CreateAutoScalingGroupResult> createAutoScalingGroupAsync(CreateAutoScalingGroupRequest createAutoScalingGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAutoScalingGroupRequest, CreateAutoScalingGroupResult> asyncHandler);

    /**
     * <p>
     * Creates a launch configuration.
     * </p>
     * <p>
     * If you exceed your maximum limit of launch configurations, which by default is 100 per region, the call fails.
     * For information about viewing and updating this limit, see <a>DescribeAccountLimits</a>.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/LaunchConfiguration.html">Launch
     * Configurations</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param createLaunchConfigurationRequest
     *        Contains the parameters for CreateLaunchConfiguration.
     * @return A Java Future containing the result of the CreateLaunchConfiguration operation returned by the service.
     * @sample AmazonAutoScalingAsync.CreateLaunchConfiguration
     */
    java.util.concurrent.Future<CreateLaunchConfigurationResult> createLaunchConfigurationAsync(
            CreateLaunchConfigurationRequest createLaunchConfigurationRequest);

    /**
     * <p>
     * Creates a launch configuration.
     * </p>
     * <p>
     * If you exceed your maximum limit of launch configurations, which by default is 100 per region, the call fails.
     * For information about viewing and updating this limit, see <a>DescribeAccountLimits</a>.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/LaunchConfiguration.html">Launch
     * Configurations</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param createLaunchConfigurationRequest
     *        Contains the parameters for CreateLaunchConfiguration.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLaunchConfiguration operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.CreateLaunchConfiguration
     */
    java.util.concurrent.Future<CreateLaunchConfigurationResult> createLaunchConfigurationAsync(
            CreateLaunchConfigurationRequest createLaunchConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLaunchConfigurationRequest, CreateLaunchConfigurationResult> asyncHandler);

    /**
     * <p>
     * Creates or updates tags for the specified Auto Scaling group.
     * </p>
     * <p>
     * When you specify a tag with a key that already exists, the operation overwrites the previous tag definition, and
     * you do not get an error message.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASTagging.html">Tagging Auto Scaling Groups
     * and Instances</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param createOrUpdateTagsRequest
     *        Contains the parameters for CreateOrUpdateTags.
     * @return A Java Future containing the result of the CreateOrUpdateTags operation returned by the service.
     * @sample AmazonAutoScalingAsync.CreateOrUpdateTags
     */
    java.util.concurrent.Future<CreateOrUpdateTagsResult> createOrUpdateTagsAsync(CreateOrUpdateTagsRequest createOrUpdateTagsRequest);

    /**
     * <p>
     * Creates or updates tags for the specified Auto Scaling group.
     * </p>
     * <p>
     * When you specify a tag with a key that already exists, the operation overwrites the previous tag definition, and
     * you do not get an error message.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASTagging.html">Tagging Auto Scaling Groups
     * and Instances</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param createOrUpdateTagsRequest
     *        Contains the parameters for CreateOrUpdateTags.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateOrUpdateTags operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.CreateOrUpdateTags
     */
    java.util.concurrent.Future<CreateOrUpdateTagsResult> createOrUpdateTagsAsync(CreateOrUpdateTagsRequest createOrUpdateTagsRequest,
            com.amazonaws.handlers.AsyncHandler<CreateOrUpdateTagsRequest, CreateOrUpdateTagsResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified Auto Scaling group.
     * </p>
     * <p>
     * If the group has instances or scaling activities in progress, you must specify the option to force the deletion
     * in order for it to succeed.
     * </p>
     * <p>
     * If the group has policies, deleting the group deletes the policies, the underlying alarm actions, and any alarm
     * that no longer has an associated action.
     * </p>
     * <p>
     * To remove instances from the Auto Scaling group before deleting it, call <a>DetachInstances</a> with the list of
     * instances and the option to decrement the desired capacity so that Auto Scaling does not launch replacement
     * instances.
     * </p>
     * <p>
     * To terminate all instances before deleting the Auto Scaling group, call <a>UpdateAutoScalingGroup</a> and set the
     * minimum size and desired capacity of the Auto Scaling group to zero.
     * </p>
     * 
     * @param deleteAutoScalingGroupRequest
     *        Contains the parameters for DeleteAutoScalingGroup.
     * @return A Java Future containing the result of the DeleteAutoScalingGroup operation returned by the service.
     * @sample AmazonAutoScalingAsync.DeleteAutoScalingGroup
     */
    java.util.concurrent.Future<DeleteAutoScalingGroupResult> deleteAutoScalingGroupAsync(DeleteAutoScalingGroupRequest deleteAutoScalingGroupRequest);

    /**
     * <p>
     * Deletes the specified Auto Scaling group.
     * </p>
     * <p>
     * If the group has instances or scaling activities in progress, you must specify the option to force the deletion
     * in order for it to succeed.
     * </p>
     * <p>
     * If the group has policies, deleting the group deletes the policies, the underlying alarm actions, and any alarm
     * that no longer has an associated action.
     * </p>
     * <p>
     * To remove instances from the Auto Scaling group before deleting it, call <a>DetachInstances</a> with the list of
     * instances and the option to decrement the desired capacity so that Auto Scaling does not launch replacement
     * instances.
     * </p>
     * <p>
     * To terminate all instances before deleting the Auto Scaling group, call <a>UpdateAutoScalingGroup</a> and set the
     * minimum size and desired capacity of the Auto Scaling group to zero.
     * </p>
     * 
     * @param deleteAutoScalingGroupRequest
     *        Contains the parameters for DeleteAutoScalingGroup.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAutoScalingGroup operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DeleteAutoScalingGroup
     */
    java.util.concurrent.Future<DeleteAutoScalingGroupResult> deleteAutoScalingGroupAsync(DeleteAutoScalingGroupRequest deleteAutoScalingGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAutoScalingGroupRequest, DeleteAutoScalingGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified launch configuration.
     * </p>
     * <p>
     * The launch configuration must not be attached to an Auto Scaling group. When this call completes, the launch
     * configuration is no longer available for use.
     * </p>
     * 
     * @param deleteLaunchConfigurationRequest
     *        Contains the parameters for DeleteLaunchConfiguration.
     * @return A Java Future containing the result of the DeleteLaunchConfiguration operation returned by the service.
     * @sample AmazonAutoScalingAsync.DeleteLaunchConfiguration
     */
    java.util.concurrent.Future<DeleteLaunchConfigurationResult> deleteLaunchConfigurationAsync(
            DeleteLaunchConfigurationRequest deleteLaunchConfigurationRequest);

    /**
     * <p>
     * Deletes the specified launch configuration.
     * </p>
     * <p>
     * The launch configuration must not be attached to an Auto Scaling group. When this call completes, the launch
     * configuration is no longer available for use.
     * </p>
     * 
     * @param deleteLaunchConfigurationRequest
     *        Contains the parameters for DeleteLaunchConfiguration.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLaunchConfiguration operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DeleteLaunchConfiguration
     */
    java.util.concurrent.Future<DeleteLaunchConfigurationResult> deleteLaunchConfigurationAsync(
            DeleteLaunchConfigurationRequest deleteLaunchConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLaunchConfigurationRequest, DeleteLaunchConfigurationResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified lifecycle hook.
     * </p>
     * <p>
     * If there are any outstanding lifecycle actions, they are completed first (<code>ABANDON</code> for launching
     * instances, <code>CONTINUE</code> for terminating instances).
     * </p>
     * 
     * @param deleteLifecycleHookRequest
     *        Contains the parameters for DeleteLifecycleHook.
     * @return A Java Future containing the result of the DeleteLifecycleHook operation returned by the service.
     * @sample AmazonAutoScalingAsync.DeleteLifecycleHook
     */
    java.util.concurrent.Future<DeleteLifecycleHookResult> deleteLifecycleHookAsync(DeleteLifecycleHookRequest deleteLifecycleHookRequest);

    /**
     * <p>
     * Deletes the specified lifecycle hook.
     * </p>
     * <p>
     * If there are any outstanding lifecycle actions, they are completed first (<code>ABANDON</code> for launching
     * instances, <code>CONTINUE</code> for terminating instances).
     * </p>
     * 
     * @param deleteLifecycleHookRequest
     *        Contains the parameters for DeleteLifecycleHook.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLifecycleHook operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DeleteLifecycleHook
     */
    java.util.concurrent.Future<DeleteLifecycleHookResult> deleteLifecycleHookAsync(DeleteLifecycleHookRequest deleteLifecycleHookRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLifecycleHookRequest, DeleteLifecycleHookResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified notification.
     * </p>
     * 
     * @param deleteNotificationConfigurationRequest
     *        Contains the parameters for DeleteNotificationConfiguration.
     * @return A Java Future containing the result of the DeleteNotificationConfiguration operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsync.DeleteNotificationConfiguration
     */
    java.util.concurrent.Future<DeleteNotificationConfigurationResult> deleteNotificationConfigurationAsync(
            DeleteNotificationConfigurationRequest deleteNotificationConfigurationRequest);

    /**
     * <p>
     * Deletes the specified notification.
     * </p>
     * 
     * @param deleteNotificationConfigurationRequest
     *        Contains the parameters for DeleteNotificationConfiguration.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteNotificationConfiguration operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsyncHandler.DeleteNotificationConfiguration
     */
    java.util.concurrent.Future<DeleteNotificationConfigurationResult> deleteNotificationConfigurationAsync(
            DeleteNotificationConfigurationRequest deleteNotificationConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteNotificationConfigurationRequest, DeleteNotificationConfigurationResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified Auto Scaling policy.
     * </p>
     * <p>
     * Deleting a policy deletes the underlying alarm action, but does not delete the alarm, even if it no longer has an
     * associated action.
     * </p>
     * 
     * @param deletePolicyRequest
     *        Contains the parameters for DeletePolicy.
     * @return A Java Future containing the result of the DeletePolicy operation returned by the service.
     * @sample AmazonAutoScalingAsync.DeletePolicy
     */
    java.util.concurrent.Future<DeletePolicyResult> deletePolicyAsync(DeletePolicyRequest deletePolicyRequest);

    /**
     * <p>
     * Deletes the specified Auto Scaling policy.
     * </p>
     * <p>
     * Deleting a policy deletes the underlying alarm action, but does not delete the alarm, even if it no longer has an
     * associated action.
     * </p>
     * 
     * @param deletePolicyRequest
     *        Contains the parameters for DeletePolicy.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePolicy operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DeletePolicy
     */
    java.util.concurrent.Future<DeletePolicyResult> deletePolicyAsync(DeletePolicyRequest deletePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePolicyRequest, DeletePolicyResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified scheduled action.
     * </p>
     * 
     * @param deleteScheduledActionRequest
     *        Contains the parameters for DeleteScheduledAction.
     * @return A Java Future containing the result of the DeleteScheduledAction operation returned by the service.
     * @sample AmazonAutoScalingAsync.DeleteScheduledAction
     */
    java.util.concurrent.Future<DeleteScheduledActionResult> deleteScheduledActionAsync(DeleteScheduledActionRequest deleteScheduledActionRequest);

    /**
     * <p>
     * Deletes the specified scheduled action.
     * </p>
     * 
     * @param deleteScheduledActionRequest
     *        Contains the parameters for DeleteScheduledAction.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteScheduledAction operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DeleteScheduledAction
     */
    java.util.concurrent.Future<DeleteScheduledActionResult> deleteScheduledActionAsync(DeleteScheduledActionRequest deleteScheduledActionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteScheduledActionRequest, DeleteScheduledActionResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified tags.
     * </p>
     * 
     * @param deleteTagsRequest
     *        Contains the parameters for DeleteTags.
     * @return A Java Future containing the result of the DeleteTags operation returned by the service.
     * @sample AmazonAutoScalingAsync.DeleteTags
     */
    java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest deleteTagsRequest);

    /**
     * <p>
     * Deletes the specified tags.
     * </p>
     * 
     * @param deleteTagsRequest
     *        Contains the parameters for DeleteTags.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTags operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DeleteTags
     */
    java.util.concurrent.Future<DeleteTagsResult> deleteTagsAsync(DeleteTagsRequest deleteTagsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTagsRequest, DeleteTagsResult> asyncHandler);

    /**
     * <p>
     * Describes the current Auto Scaling resource limits for your AWS account.
     * </p>
     * <p>
     * For information about requesting an increase in these limits, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html">AWS Service Limits</a> in the
     * <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param describeAccountLimitsRequest
     * @return A Java Future containing the result of the DescribeAccountLimits operation returned by the service.
     * @sample AmazonAutoScalingAsync.DescribeAccountLimits
     */
    java.util.concurrent.Future<DescribeAccountLimitsResult> describeAccountLimitsAsync(DescribeAccountLimitsRequest describeAccountLimitsRequest);

    /**
     * <p>
     * Describes the current Auto Scaling resource limits for your AWS account.
     * </p>
     * <p>
     * For information about requesting an increase in these limits, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html">AWS Service Limits</a> in the
     * <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param describeAccountLimitsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAccountLimits operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DescribeAccountLimits
     */
    java.util.concurrent.Future<DescribeAccountLimitsResult> describeAccountLimitsAsync(DescribeAccountLimitsRequest describeAccountLimitsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAccountLimitsRequest, DescribeAccountLimitsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeAccountLimits operation.
     *
     * @see #describeAccountLimitsAsync(DescribeAccountLimitsRequest)
     */
    java.util.concurrent.Future<DescribeAccountLimitsResult> describeAccountLimitsAsync();

    /**
     * Simplified method form for invoking the DescribeAccountLimits operation with an AsyncHandler.
     *
     * @see #describeAccountLimitsAsync(DescribeAccountLimitsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeAccountLimitsResult> describeAccountLimitsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeAccountLimitsRequest, DescribeAccountLimitsResult> asyncHandler);

    /**
     * <p>
     * Describes the policy adjustment types for use with <a>PutScalingPolicy</a>.
     * </p>
     * 
     * @param describeAdjustmentTypesRequest
     * @return A Java Future containing the result of the DescribeAdjustmentTypes operation returned by the service.
     * @sample AmazonAutoScalingAsync.DescribeAdjustmentTypes
     */
    java.util.concurrent.Future<DescribeAdjustmentTypesResult> describeAdjustmentTypesAsync(DescribeAdjustmentTypesRequest describeAdjustmentTypesRequest);

    /**
     * <p>
     * Describes the policy adjustment types for use with <a>PutScalingPolicy</a>.
     * </p>
     * 
     * @param describeAdjustmentTypesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAdjustmentTypes operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DescribeAdjustmentTypes
     */
    java.util.concurrent.Future<DescribeAdjustmentTypesResult> describeAdjustmentTypesAsync(DescribeAdjustmentTypesRequest describeAdjustmentTypesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAdjustmentTypesRequest, DescribeAdjustmentTypesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeAdjustmentTypes operation.
     *
     * @see #describeAdjustmentTypesAsync(DescribeAdjustmentTypesRequest)
     */
    java.util.concurrent.Future<DescribeAdjustmentTypesResult> describeAdjustmentTypesAsync();

    /**
     * Simplified method form for invoking the DescribeAdjustmentTypes operation with an AsyncHandler.
     *
     * @see #describeAdjustmentTypesAsync(DescribeAdjustmentTypesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeAdjustmentTypesResult> describeAdjustmentTypesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeAdjustmentTypesRequest, DescribeAdjustmentTypesResult> asyncHandler);

    /**
     * <p>
     * Describes one or more Auto Scaling groups.
     * </p>
     * 
     * @param describeAutoScalingGroupsRequest
     *        Contains the parameters for DescribeAutoScalingGroups.
     * @return A Java Future containing the result of the DescribeAutoScalingGroups operation returned by the service.
     * @sample AmazonAutoScalingAsync.DescribeAutoScalingGroups
     */
    java.util.concurrent.Future<DescribeAutoScalingGroupsResult> describeAutoScalingGroupsAsync(
            DescribeAutoScalingGroupsRequest describeAutoScalingGroupsRequest);

    /**
     * <p>
     * Describes one or more Auto Scaling groups.
     * </p>
     * 
     * @param describeAutoScalingGroupsRequest
     *        Contains the parameters for DescribeAutoScalingGroups.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAutoScalingGroups operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DescribeAutoScalingGroups
     */
    java.util.concurrent.Future<DescribeAutoScalingGroupsResult> describeAutoScalingGroupsAsync(
            DescribeAutoScalingGroupsRequest describeAutoScalingGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAutoScalingGroupsRequest, DescribeAutoScalingGroupsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeAutoScalingGroups operation.
     *
     * @see #describeAutoScalingGroupsAsync(DescribeAutoScalingGroupsRequest)
     */
    java.util.concurrent.Future<DescribeAutoScalingGroupsResult> describeAutoScalingGroupsAsync();

    /**
     * Simplified method form for invoking the DescribeAutoScalingGroups operation with an AsyncHandler.
     *
     * @see #describeAutoScalingGroupsAsync(DescribeAutoScalingGroupsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeAutoScalingGroupsResult> describeAutoScalingGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeAutoScalingGroupsRequest, DescribeAutoScalingGroupsResult> asyncHandler);

    /**
     * <p>
     * Describes one or more Auto Scaling instances.
     * </p>
     * 
     * @param describeAutoScalingInstancesRequest
     *        Contains the parameters for DescribeAutoScalingInstances.
     * @return A Java Future containing the result of the DescribeAutoScalingInstances operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsync.DescribeAutoScalingInstances
     */
    java.util.concurrent.Future<DescribeAutoScalingInstancesResult> describeAutoScalingInstancesAsync(
            DescribeAutoScalingInstancesRequest describeAutoScalingInstancesRequest);

    /**
     * <p>
     * Describes one or more Auto Scaling instances.
     * </p>
     * 
     * @param describeAutoScalingInstancesRequest
     *        Contains the parameters for DescribeAutoScalingInstances.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAutoScalingInstances operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsyncHandler.DescribeAutoScalingInstances
     */
    java.util.concurrent.Future<DescribeAutoScalingInstancesResult> describeAutoScalingInstancesAsync(
            DescribeAutoScalingInstancesRequest describeAutoScalingInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAutoScalingInstancesRequest, DescribeAutoScalingInstancesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeAutoScalingInstances operation.
     *
     * @see #describeAutoScalingInstancesAsync(DescribeAutoScalingInstancesRequest)
     */
    java.util.concurrent.Future<DescribeAutoScalingInstancesResult> describeAutoScalingInstancesAsync();

    /**
     * Simplified method form for invoking the DescribeAutoScalingInstances operation with an AsyncHandler.
     *
     * @see #describeAutoScalingInstancesAsync(DescribeAutoScalingInstancesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeAutoScalingInstancesResult> describeAutoScalingInstancesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeAutoScalingInstancesRequest, DescribeAutoScalingInstancesResult> asyncHandler);

    /**
     * <p>
     * Describes the notification types that are supported by Auto Scaling.
     * </p>
     * 
     * @param describeAutoScalingNotificationTypesRequest
     * @return A Java Future containing the result of the DescribeAutoScalingNotificationTypes operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsync.DescribeAutoScalingNotificationTypes
     */
    java.util.concurrent.Future<DescribeAutoScalingNotificationTypesResult> describeAutoScalingNotificationTypesAsync(
            DescribeAutoScalingNotificationTypesRequest describeAutoScalingNotificationTypesRequest);

    /**
     * <p>
     * Describes the notification types that are supported by Auto Scaling.
     * </p>
     * 
     * @param describeAutoScalingNotificationTypesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAutoScalingNotificationTypes operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsyncHandler.DescribeAutoScalingNotificationTypes
     */
    java.util.concurrent.Future<DescribeAutoScalingNotificationTypesResult> describeAutoScalingNotificationTypesAsync(
            DescribeAutoScalingNotificationTypesRequest describeAutoScalingNotificationTypesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAutoScalingNotificationTypesRequest, DescribeAutoScalingNotificationTypesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeAutoScalingNotificationTypes operation.
     *
     * @see #describeAutoScalingNotificationTypesAsync(DescribeAutoScalingNotificationTypesRequest)
     */
    java.util.concurrent.Future<DescribeAutoScalingNotificationTypesResult> describeAutoScalingNotificationTypesAsync();

    /**
     * Simplified method form for invoking the DescribeAutoScalingNotificationTypes operation with an AsyncHandler.
     *
     * @see #describeAutoScalingNotificationTypesAsync(DescribeAutoScalingNotificationTypesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeAutoScalingNotificationTypesResult> describeAutoScalingNotificationTypesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeAutoScalingNotificationTypesRequest, DescribeAutoScalingNotificationTypesResult> asyncHandler);

    /**
     * <p>
     * Describes one or more launch configurations.
     * </p>
     * 
     * @param describeLaunchConfigurationsRequest
     *        Contains the parameters for DescribeLaunchConfigurations.
     * @return A Java Future containing the result of the DescribeLaunchConfigurations operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsync.DescribeLaunchConfigurations
     */
    java.util.concurrent.Future<DescribeLaunchConfigurationsResult> describeLaunchConfigurationsAsync(
            DescribeLaunchConfigurationsRequest describeLaunchConfigurationsRequest);

    /**
     * <p>
     * Describes one or more launch configurations.
     * </p>
     * 
     * @param describeLaunchConfigurationsRequest
     *        Contains the parameters for DescribeLaunchConfigurations.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLaunchConfigurations operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsyncHandler.DescribeLaunchConfigurations
     */
    java.util.concurrent.Future<DescribeLaunchConfigurationsResult> describeLaunchConfigurationsAsync(
            DescribeLaunchConfigurationsRequest describeLaunchConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLaunchConfigurationsRequest, DescribeLaunchConfigurationsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeLaunchConfigurations operation.
     *
     * @see #describeLaunchConfigurationsAsync(DescribeLaunchConfigurationsRequest)
     */
    java.util.concurrent.Future<DescribeLaunchConfigurationsResult> describeLaunchConfigurationsAsync();

    /**
     * Simplified method form for invoking the DescribeLaunchConfigurations operation with an AsyncHandler.
     *
     * @see #describeLaunchConfigurationsAsync(DescribeLaunchConfigurationsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeLaunchConfigurationsResult> describeLaunchConfigurationsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeLaunchConfigurationsRequest, DescribeLaunchConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Describes the available types of lifecycle hooks.
     * </p>
     * 
     * @param describeLifecycleHookTypesRequest
     * @return A Java Future containing the result of the DescribeLifecycleHookTypes operation returned by the service.
     * @sample AmazonAutoScalingAsync.DescribeLifecycleHookTypes
     */
    java.util.concurrent.Future<DescribeLifecycleHookTypesResult> describeLifecycleHookTypesAsync(
            DescribeLifecycleHookTypesRequest describeLifecycleHookTypesRequest);

    /**
     * <p>
     * Describes the available types of lifecycle hooks.
     * </p>
     * 
     * @param describeLifecycleHookTypesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLifecycleHookTypes operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DescribeLifecycleHookTypes
     */
    java.util.concurrent.Future<DescribeLifecycleHookTypesResult> describeLifecycleHookTypesAsync(
            DescribeLifecycleHookTypesRequest describeLifecycleHookTypesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLifecycleHookTypesRequest, DescribeLifecycleHookTypesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeLifecycleHookTypes operation.
     *
     * @see #describeLifecycleHookTypesAsync(DescribeLifecycleHookTypesRequest)
     */
    java.util.concurrent.Future<DescribeLifecycleHookTypesResult> describeLifecycleHookTypesAsync();

    /**
     * Simplified method form for invoking the DescribeLifecycleHookTypes operation with an AsyncHandler.
     *
     * @see #describeLifecycleHookTypesAsync(DescribeLifecycleHookTypesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeLifecycleHookTypesResult> describeLifecycleHookTypesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeLifecycleHookTypesRequest, DescribeLifecycleHookTypesResult> asyncHandler);

    /**
     * <p>
     * Describes the lifecycle hooks for the specified Auto Scaling group.
     * </p>
     * 
     * @param describeLifecycleHooksRequest
     *        Contains the parameters for DescribeLifecycleHooks.
     * @return A Java Future containing the result of the DescribeLifecycleHooks operation returned by the service.
     * @sample AmazonAutoScalingAsync.DescribeLifecycleHooks
     */
    java.util.concurrent.Future<DescribeLifecycleHooksResult> describeLifecycleHooksAsync(DescribeLifecycleHooksRequest describeLifecycleHooksRequest);

    /**
     * <p>
     * Describes the lifecycle hooks for the specified Auto Scaling group.
     * </p>
     * 
     * @param describeLifecycleHooksRequest
     *        Contains the parameters for DescribeLifecycleHooks.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLifecycleHooks operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DescribeLifecycleHooks
     */
    java.util.concurrent.Future<DescribeLifecycleHooksResult> describeLifecycleHooksAsync(DescribeLifecycleHooksRequest describeLifecycleHooksRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLifecycleHooksRequest, DescribeLifecycleHooksResult> asyncHandler);

    /**
     * <p>
     * Describes the target groups for the specified Auto Scaling group.
     * </p>
     * 
     * @param describeLoadBalancerTargetGroupsRequest
     *        Contains the parameters for DescribeLoadBalancerTargetGroups.
     * @return A Java Future containing the result of the DescribeLoadBalancerTargetGroups operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsync.DescribeLoadBalancerTargetGroups
     */
    java.util.concurrent.Future<DescribeLoadBalancerTargetGroupsResult> describeLoadBalancerTargetGroupsAsync(
            DescribeLoadBalancerTargetGroupsRequest describeLoadBalancerTargetGroupsRequest);

    /**
     * <p>
     * Describes the target groups for the specified Auto Scaling group.
     * </p>
     * 
     * @param describeLoadBalancerTargetGroupsRequest
     *        Contains the parameters for DescribeLoadBalancerTargetGroups.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLoadBalancerTargetGroups operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsyncHandler.DescribeLoadBalancerTargetGroups
     */
    java.util.concurrent.Future<DescribeLoadBalancerTargetGroupsResult> describeLoadBalancerTargetGroupsAsync(
            DescribeLoadBalancerTargetGroupsRequest describeLoadBalancerTargetGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLoadBalancerTargetGroupsRequest, DescribeLoadBalancerTargetGroupsResult> asyncHandler);

    /**
     * <p>
     * Describes the load balancers for the specified Auto Scaling group.
     * </p>
     * <p>
     * Note that this operation describes only Classic load balancers. If you have Application load balancers, use
     * <a>DescribeLoadBalancerTargetGroups</a> instead.
     * </p>
     * 
     * @param describeLoadBalancersRequest
     *        Contains the parameters for DescribeLoadBalancers.
     * @return A Java Future containing the result of the DescribeLoadBalancers operation returned by the service.
     * @sample AmazonAutoScalingAsync.DescribeLoadBalancers
     */
    java.util.concurrent.Future<DescribeLoadBalancersResult> describeLoadBalancersAsync(DescribeLoadBalancersRequest describeLoadBalancersRequest);

    /**
     * <p>
     * Describes the load balancers for the specified Auto Scaling group.
     * </p>
     * <p>
     * Note that this operation describes only Classic load balancers. If you have Application load balancers, use
     * <a>DescribeLoadBalancerTargetGroups</a> instead.
     * </p>
     * 
     * @param describeLoadBalancersRequest
     *        Contains the parameters for DescribeLoadBalancers.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeLoadBalancers operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DescribeLoadBalancers
     */
    java.util.concurrent.Future<DescribeLoadBalancersResult> describeLoadBalancersAsync(DescribeLoadBalancersRequest describeLoadBalancersRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeLoadBalancersRequest, DescribeLoadBalancersResult> asyncHandler);

    /**
     * <p>
     * Describes the available CloudWatch metrics for Auto Scaling.
     * </p>
     * <p>
     * Note that the <code>GroupStandbyInstances</code> metric is not returned by default. You must explicitly request
     * this metric when calling <a>EnableMetricsCollection</a>.
     * </p>
     * 
     * @param describeMetricCollectionTypesRequest
     * @return A Java Future containing the result of the DescribeMetricCollectionTypes operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsync.DescribeMetricCollectionTypes
     */
    java.util.concurrent.Future<DescribeMetricCollectionTypesResult> describeMetricCollectionTypesAsync(
            DescribeMetricCollectionTypesRequest describeMetricCollectionTypesRequest);

    /**
     * <p>
     * Describes the available CloudWatch metrics for Auto Scaling.
     * </p>
     * <p>
     * Note that the <code>GroupStandbyInstances</code> metric is not returned by default. You must explicitly request
     * this metric when calling <a>EnableMetricsCollection</a>.
     * </p>
     * 
     * @param describeMetricCollectionTypesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeMetricCollectionTypes operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsyncHandler.DescribeMetricCollectionTypes
     */
    java.util.concurrent.Future<DescribeMetricCollectionTypesResult> describeMetricCollectionTypesAsync(
            DescribeMetricCollectionTypesRequest describeMetricCollectionTypesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeMetricCollectionTypesRequest, DescribeMetricCollectionTypesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeMetricCollectionTypes operation.
     *
     * @see #describeMetricCollectionTypesAsync(DescribeMetricCollectionTypesRequest)
     */
    java.util.concurrent.Future<DescribeMetricCollectionTypesResult> describeMetricCollectionTypesAsync();

    /**
     * Simplified method form for invoking the DescribeMetricCollectionTypes operation with an AsyncHandler.
     *
     * @see #describeMetricCollectionTypesAsync(DescribeMetricCollectionTypesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeMetricCollectionTypesResult> describeMetricCollectionTypesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeMetricCollectionTypesRequest, DescribeMetricCollectionTypesResult> asyncHandler);

    /**
     * <p>
     * Describes the notification actions associated with the specified Auto Scaling group.
     * </p>
     * 
     * @param describeNotificationConfigurationsRequest
     *        Contains the parameters for DescribeNotificationConfigurations.
     * @return A Java Future containing the result of the DescribeNotificationConfigurations operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsync.DescribeNotificationConfigurations
     */
    java.util.concurrent.Future<DescribeNotificationConfigurationsResult> describeNotificationConfigurationsAsync(
            DescribeNotificationConfigurationsRequest describeNotificationConfigurationsRequest);

    /**
     * <p>
     * Describes the notification actions associated with the specified Auto Scaling group.
     * </p>
     * 
     * @param describeNotificationConfigurationsRequest
     *        Contains the parameters for DescribeNotificationConfigurations.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeNotificationConfigurations operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsyncHandler.DescribeNotificationConfigurations
     */
    java.util.concurrent.Future<DescribeNotificationConfigurationsResult> describeNotificationConfigurationsAsync(
            DescribeNotificationConfigurationsRequest describeNotificationConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeNotificationConfigurationsRequest, DescribeNotificationConfigurationsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeNotificationConfigurations operation.
     *
     * @see #describeNotificationConfigurationsAsync(DescribeNotificationConfigurationsRequest)
     */
    java.util.concurrent.Future<DescribeNotificationConfigurationsResult> describeNotificationConfigurationsAsync();

    /**
     * Simplified method form for invoking the DescribeNotificationConfigurations operation with an AsyncHandler.
     *
     * @see #describeNotificationConfigurationsAsync(DescribeNotificationConfigurationsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeNotificationConfigurationsResult> describeNotificationConfigurationsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeNotificationConfigurationsRequest, DescribeNotificationConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Describes the policies for the specified Auto Scaling group.
     * </p>
     * 
     * @param describePoliciesRequest
     *        Contains the parameters for DescribePolicies.
     * @return A Java Future containing the result of the DescribePolicies operation returned by the service.
     * @sample AmazonAutoScalingAsync.DescribePolicies
     */
    java.util.concurrent.Future<DescribePoliciesResult> describePoliciesAsync(DescribePoliciesRequest describePoliciesRequest);

    /**
     * <p>
     * Describes the policies for the specified Auto Scaling group.
     * </p>
     * 
     * @param describePoliciesRequest
     *        Contains the parameters for DescribePolicies.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePolicies operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DescribePolicies
     */
    java.util.concurrent.Future<DescribePoliciesResult> describePoliciesAsync(DescribePoliciesRequest describePoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePoliciesRequest, DescribePoliciesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribePolicies operation.
     *
     * @see #describePoliciesAsync(DescribePoliciesRequest)
     */
    java.util.concurrent.Future<DescribePoliciesResult> describePoliciesAsync();

    /**
     * Simplified method form for invoking the DescribePolicies operation with an AsyncHandler.
     *
     * @see #describePoliciesAsync(DescribePoliciesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribePoliciesResult> describePoliciesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribePoliciesRequest, DescribePoliciesResult> asyncHandler);

    /**
     * <p>
     * Describes one or more scaling activities for the specified Auto Scaling group.
     * </p>
     * 
     * @param describeScalingActivitiesRequest
     *        Contains the parameters for DescribeScalingActivities.
     * @return A Java Future containing the result of the DescribeScalingActivities operation returned by the service.
     * @sample AmazonAutoScalingAsync.DescribeScalingActivities
     */
    java.util.concurrent.Future<DescribeScalingActivitiesResult> describeScalingActivitiesAsync(
            DescribeScalingActivitiesRequest describeScalingActivitiesRequest);

    /**
     * <p>
     * Describes one or more scaling activities for the specified Auto Scaling group.
     * </p>
     * 
     * @param describeScalingActivitiesRequest
     *        Contains the parameters for DescribeScalingActivities.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeScalingActivities operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DescribeScalingActivities
     */
    java.util.concurrent.Future<DescribeScalingActivitiesResult> describeScalingActivitiesAsync(
            DescribeScalingActivitiesRequest describeScalingActivitiesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeScalingActivitiesRequest, DescribeScalingActivitiesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeScalingActivities operation.
     *
     * @see #describeScalingActivitiesAsync(DescribeScalingActivitiesRequest)
     */
    java.util.concurrent.Future<DescribeScalingActivitiesResult> describeScalingActivitiesAsync();

    /**
     * Simplified method form for invoking the DescribeScalingActivities operation with an AsyncHandler.
     *
     * @see #describeScalingActivitiesAsync(DescribeScalingActivitiesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeScalingActivitiesResult> describeScalingActivitiesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeScalingActivitiesRequest, DescribeScalingActivitiesResult> asyncHandler);

    /**
     * <p>
     * Describes the scaling process types for use with <a>ResumeProcesses</a> and <a>SuspendProcesses</a>.
     * </p>
     * 
     * @param describeScalingProcessTypesRequest
     * @return A Java Future containing the result of the DescribeScalingProcessTypes operation returned by the service.
     * @sample AmazonAutoScalingAsync.DescribeScalingProcessTypes
     */
    java.util.concurrent.Future<DescribeScalingProcessTypesResult> describeScalingProcessTypesAsync(
            DescribeScalingProcessTypesRequest describeScalingProcessTypesRequest);

    /**
     * <p>
     * Describes the scaling process types for use with <a>ResumeProcesses</a> and <a>SuspendProcesses</a>.
     * </p>
     * 
     * @param describeScalingProcessTypesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeScalingProcessTypes operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DescribeScalingProcessTypes
     */
    java.util.concurrent.Future<DescribeScalingProcessTypesResult> describeScalingProcessTypesAsync(
            DescribeScalingProcessTypesRequest describeScalingProcessTypesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeScalingProcessTypesRequest, DescribeScalingProcessTypesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeScalingProcessTypes operation.
     *
     * @see #describeScalingProcessTypesAsync(DescribeScalingProcessTypesRequest)
     */
    java.util.concurrent.Future<DescribeScalingProcessTypesResult> describeScalingProcessTypesAsync();

    /**
     * Simplified method form for invoking the DescribeScalingProcessTypes operation with an AsyncHandler.
     *
     * @see #describeScalingProcessTypesAsync(DescribeScalingProcessTypesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeScalingProcessTypesResult> describeScalingProcessTypesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeScalingProcessTypesRequest, DescribeScalingProcessTypesResult> asyncHandler);

    /**
     * <p>
     * Describes the actions scheduled for your Auto Scaling group that haven't run. To describe the actions that have
     * already run, use <a>DescribeScalingActivities</a>.
     * </p>
     * 
     * @param describeScheduledActionsRequest
     *        Contains the parameters for DescribeScheduledActions.
     * @return A Java Future containing the result of the DescribeScheduledActions operation returned by the service.
     * @sample AmazonAutoScalingAsync.DescribeScheduledActions
     */
    java.util.concurrent.Future<DescribeScheduledActionsResult> describeScheduledActionsAsync(DescribeScheduledActionsRequest describeScheduledActionsRequest);

    /**
     * <p>
     * Describes the actions scheduled for your Auto Scaling group that haven't run. To describe the actions that have
     * already run, use <a>DescribeScalingActivities</a>.
     * </p>
     * 
     * @param describeScheduledActionsRequest
     *        Contains the parameters for DescribeScheduledActions.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeScheduledActions operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DescribeScheduledActions
     */
    java.util.concurrent.Future<DescribeScheduledActionsResult> describeScheduledActionsAsync(DescribeScheduledActionsRequest describeScheduledActionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeScheduledActionsRequest, DescribeScheduledActionsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeScheduledActions operation.
     *
     * @see #describeScheduledActionsAsync(DescribeScheduledActionsRequest)
     */
    java.util.concurrent.Future<DescribeScheduledActionsResult> describeScheduledActionsAsync();

    /**
     * Simplified method form for invoking the DescribeScheduledActions operation with an AsyncHandler.
     *
     * @see #describeScheduledActionsAsync(DescribeScheduledActionsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeScheduledActionsResult> describeScheduledActionsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeScheduledActionsRequest, DescribeScheduledActionsResult> asyncHandler);

    /**
     * <p>
     * Describes the specified tags.
     * </p>
     * <p>
     * You can use filters to limit the results. For example, you can query for the tags for a specific Auto Scaling
     * group. You can specify multiple values for a filter. A tag must match at least one of the specified values for it
     * to be included in the results.
     * </p>
     * <p>
     * You can also specify multiple filters. The result includes information for a particular tag only if it matches
     * all the filters. If there's no match, no special message is returned.
     * </p>
     * 
     * @param describeTagsRequest
     *        Contains the parameters for DescribeTags.
     * @return A Java Future containing the result of the DescribeTags operation returned by the service.
     * @sample AmazonAutoScalingAsync.DescribeTags
     */
    java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest describeTagsRequest);

    /**
     * <p>
     * Describes the specified tags.
     * </p>
     * <p>
     * You can use filters to limit the results. For example, you can query for the tags for a specific Auto Scaling
     * group. You can specify multiple values for a filter. A tag must match at least one of the specified values for it
     * to be included in the results.
     * </p>
     * <p>
     * You can also specify multiple filters. The result includes information for a particular tag only if it matches
     * all the filters. If there's no match, no special message is returned.
     * </p>
     * 
     * @param describeTagsRequest
     *        Contains the parameters for DescribeTags.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTags operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DescribeTags
     */
    java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(DescribeTagsRequest describeTagsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeTags operation.
     *
     * @see #describeTagsAsync(DescribeTagsRequest)
     */
    java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync();

    /**
     * Simplified method form for invoking the DescribeTags operation with an AsyncHandler.
     *
     * @see #describeTagsAsync(DescribeTagsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(com.amazonaws.handlers.AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler);

    /**
     * <p>
     * Describes the termination policies supported by Auto Scaling.
     * </p>
     * 
     * @param describeTerminationPolicyTypesRequest
     * @return A Java Future containing the result of the DescribeTerminationPolicyTypes operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsync.DescribeTerminationPolicyTypes
     */
    java.util.concurrent.Future<DescribeTerminationPolicyTypesResult> describeTerminationPolicyTypesAsync(
            DescribeTerminationPolicyTypesRequest describeTerminationPolicyTypesRequest);

    /**
     * <p>
     * Describes the termination policies supported by Auto Scaling.
     * </p>
     * 
     * @param describeTerminationPolicyTypesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTerminationPolicyTypes operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsyncHandler.DescribeTerminationPolicyTypes
     */
    java.util.concurrent.Future<DescribeTerminationPolicyTypesResult> describeTerminationPolicyTypesAsync(
            DescribeTerminationPolicyTypesRequest describeTerminationPolicyTypesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTerminationPolicyTypesRequest, DescribeTerminationPolicyTypesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeTerminationPolicyTypes operation.
     *
     * @see #describeTerminationPolicyTypesAsync(DescribeTerminationPolicyTypesRequest)
     */
    java.util.concurrent.Future<DescribeTerminationPolicyTypesResult> describeTerminationPolicyTypesAsync();

    /**
     * Simplified method form for invoking the DescribeTerminationPolicyTypes operation with an AsyncHandler.
     *
     * @see #describeTerminationPolicyTypesAsync(DescribeTerminationPolicyTypesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeTerminationPolicyTypesResult> describeTerminationPolicyTypesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeTerminationPolicyTypesRequest, DescribeTerminationPolicyTypesResult> asyncHandler);

    /**
     * <p>
     * Removes one or more instances from the specified Auto Scaling group.
     * </p>
     * <p>
     * After the instances are detached, you can manage them independently from the rest of the Auto Scaling group.
     * </p>
     * <p>
     * If you do not specify the option to decrement the desired capacity, Auto Scaling launches instances to replace
     * the ones that are detached.
     * </p>
     * <p>
     * If there is a Classic load balancer attached to the Auto Scaling group, the instances are deregistered from the
     * load balancer. If there are target groups attached to the Auto Scaling group, the instances are deregistered from
     * the target groups.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/detach-instance-asg.html">Detach EC2 Instances
     * from Your Auto Scaling Group</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param detachInstancesRequest
     *        Contains the parameters for DetachInstances.
     * @return A Java Future containing the result of the DetachInstances operation returned by the service.
     * @sample AmazonAutoScalingAsync.DetachInstances
     */
    java.util.concurrent.Future<DetachInstancesResult> detachInstancesAsync(DetachInstancesRequest detachInstancesRequest);

    /**
     * <p>
     * Removes one or more instances from the specified Auto Scaling group.
     * </p>
     * <p>
     * After the instances are detached, you can manage them independently from the rest of the Auto Scaling group.
     * </p>
     * <p>
     * If you do not specify the option to decrement the desired capacity, Auto Scaling launches instances to replace
     * the ones that are detached.
     * </p>
     * <p>
     * If there is a Classic load balancer attached to the Auto Scaling group, the instances are deregistered from the
     * load balancer. If there are target groups attached to the Auto Scaling group, the instances are deregistered from
     * the target groups.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/detach-instance-asg.html">Detach EC2 Instances
     * from Your Auto Scaling Group</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param detachInstancesRequest
     *        Contains the parameters for DetachInstances.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetachInstances operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DetachInstances
     */
    java.util.concurrent.Future<DetachInstancesResult> detachInstancesAsync(DetachInstancesRequest detachInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<DetachInstancesRequest, DetachInstancesResult> asyncHandler);

    /**
     * <p>
     * Detaches one or more target groups from the specified Auto Scaling group.
     * </p>
     * 
     * @param detachLoadBalancerTargetGroupsRequest
     * @return A Java Future containing the result of the DetachLoadBalancerTargetGroups operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsync.DetachLoadBalancerTargetGroups
     */
    java.util.concurrent.Future<DetachLoadBalancerTargetGroupsResult> detachLoadBalancerTargetGroupsAsync(
            DetachLoadBalancerTargetGroupsRequest detachLoadBalancerTargetGroupsRequest);

    /**
     * <p>
     * Detaches one or more target groups from the specified Auto Scaling group.
     * </p>
     * 
     * @param detachLoadBalancerTargetGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetachLoadBalancerTargetGroups operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsyncHandler.DetachLoadBalancerTargetGroups
     */
    java.util.concurrent.Future<DetachLoadBalancerTargetGroupsResult> detachLoadBalancerTargetGroupsAsync(
            DetachLoadBalancerTargetGroupsRequest detachLoadBalancerTargetGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<DetachLoadBalancerTargetGroupsRequest, DetachLoadBalancerTargetGroupsResult> asyncHandler);

    /**
     * <p>
     * Detaches one or more Classic load balancers from the specified Auto Scaling group.
     * </p>
     * <p>
     * Note that this operation detaches only Classic load balancers. If you have Application load balancers, use
     * <a>DetachLoadBalancerTargetGroups</a> instead.
     * </p>
     * <p>
     * When you detach a load balancer, it enters the <code>Removing</code> state while deregistering the instances in
     * the group. When all instances are deregistered, then you can no longer describe the load balancer using
     * <a>DescribeLoadBalancers</a>. Note that the instances remain running.
     * </p>
     * 
     * @param detachLoadBalancersRequest
     *        Contains the parameters for DetachLoadBalancers.
     * @return A Java Future containing the result of the DetachLoadBalancers operation returned by the service.
     * @sample AmazonAutoScalingAsync.DetachLoadBalancers
     */
    java.util.concurrent.Future<DetachLoadBalancersResult> detachLoadBalancersAsync(DetachLoadBalancersRequest detachLoadBalancersRequest);

    /**
     * <p>
     * Detaches one or more Classic load balancers from the specified Auto Scaling group.
     * </p>
     * <p>
     * Note that this operation detaches only Classic load balancers. If you have Application load balancers, use
     * <a>DetachLoadBalancerTargetGroups</a> instead.
     * </p>
     * <p>
     * When you detach a load balancer, it enters the <code>Removing</code> state while deregistering the instances in
     * the group. When all instances are deregistered, then you can no longer describe the load balancer using
     * <a>DescribeLoadBalancers</a>. Note that the instances remain running.
     * </p>
     * 
     * @param detachLoadBalancersRequest
     *        Contains the parameters for DetachLoadBalancers.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetachLoadBalancers operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DetachLoadBalancers
     */
    java.util.concurrent.Future<DetachLoadBalancersResult> detachLoadBalancersAsync(DetachLoadBalancersRequest detachLoadBalancersRequest,
            com.amazonaws.handlers.AsyncHandler<DetachLoadBalancersRequest, DetachLoadBalancersResult> asyncHandler);

    /**
     * Simplified method form for invoking the DetachLoadBalancers operation.
     *
     * @see #detachLoadBalancersAsync(DetachLoadBalancersRequest)
     */
    java.util.concurrent.Future<DetachLoadBalancersResult> detachLoadBalancersAsync();

    /**
     * Simplified method form for invoking the DetachLoadBalancers operation with an AsyncHandler.
     *
     * @see #detachLoadBalancersAsync(DetachLoadBalancersRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DetachLoadBalancersResult> detachLoadBalancersAsync(
            com.amazonaws.handlers.AsyncHandler<DetachLoadBalancersRequest, DetachLoadBalancersResult> asyncHandler);

    /**
     * <p>
     * Disables group metrics for the specified Auto Scaling group.
     * </p>
     * 
     * @param disableMetricsCollectionRequest
     *        Contains the parameters for DisableMetricsCollection.
     * @return A Java Future containing the result of the DisableMetricsCollection operation returned by the service.
     * @sample AmazonAutoScalingAsync.DisableMetricsCollection
     */
    java.util.concurrent.Future<DisableMetricsCollectionResult> disableMetricsCollectionAsync(DisableMetricsCollectionRequest disableMetricsCollectionRequest);

    /**
     * <p>
     * Disables group metrics for the specified Auto Scaling group.
     * </p>
     * 
     * @param disableMetricsCollectionRequest
     *        Contains the parameters for DisableMetricsCollection.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableMetricsCollection operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.DisableMetricsCollection
     */
    java.util.concurrent.Future<DisableMetricsCollectionResult> disableMetricsCollectionAsync(DisableMetricsCollectionRequest disableMetricsCollectionRequest,
            com.amazonaws.handlers.AsyncHandler<DisableMetricsCollectionRequest, DisableMetricsCollectionResult> asyncHandler);

    /**
     * <p>
     * Enables group metrics for the specified Auto Scaling group. For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/userguide/as-instance-monitoring.html">Monitoring Your Auto
     * Scaling Groups and Instances</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param enableMetricsCollectionRequest
     *        Contains the parameters for EnableMetricsCollection.
     * @return A Java Future containing the result of the EnableMetricsCollection operation returned by the service.
     * @sample AmazonAutoScalingAsync.EnableMetricsCollection
     */
    java.util.concurrent.Future<EnableMetricsCollectionResult> enableMetricsCollectionAsync(EnableMetricsCollectionRequest enableMetricsCollectionRequest);

    /**
     * <p>
     * Enables group metrics for the specified Auto Scaling group. For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/userguide/as-instance-monitoring.html">Monitoring Your Auto
     * Scaling Groups and Instances</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param enableMetricsCollectionRequest
     *        Contains the parameters for EnableMetricsCollection.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableMetricsCollection operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.EnableMetricsCollection
     */
    java.util.concurrent.Future<EnableMetricsCollectionResult> enableMetricsCollectionAsync(EnableMetricsCollectionRequest enableMetricsCollectionRequest,
            com.amazonaws.handlers.AsyncHandler<EnableMetricsCollectionRequest, EnableMetricsCollectionResult> asyncHandler);

    /**
     * <p>
     * Moves the specified instances into <code>Standby</code> mode.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingGroupLifecycle.html">Auto Scaling
     * Lifecycle</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param enterStandbyRequest
     *        Contains the parameters for EnteStandby.
     * @return A Java Future containing the result of the EnterStandby operation returned by the service.
     * @sample AmazonAutoScalingAsync.EnterStandby
     */
    java.util.concurrent.Future<EnterStandbyResult> enterStandbyAsync(EnterStandbyRequest enterStandbyRequest);

    /**
     * <p>
     * Moves the specified instances into <code>Standby</code> mode.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingGroupLifecycle.html">Auto Scaling
     * Lifecycle</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param enterStandbyRequest
     *        Contains the parameters for EnteStandby.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnterStandby operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.EnterStandby
     */
    java.util.concurrent.Future<EnterStandbyResult> enterStandbyAsync(EnterStandbyRequest enterStandbyRequest,
            com.amazonaws.handlers.AsyncHandler<EnterStandbyRequest, EnterStandbyResult> asyncHandler);

    /**
     * <p>
     * Executes the specified policy.
     * </p>
     * 
     * @param executePolicyRequest
     *        Contains the parameters for ExecutePolicy.
     * @return A Java Future containing the result of the ExecutePolicy operation returned by the service.
     * @sample AmazonAutoScalingAsync.ExecutePolicy
     */
    java.util.concurrent.Future<ExecutePolicyResult> executePolicyAsync(ExecutePolicyRequest executePolicyRequest);

    /**
     * <p>
     * Executes the specified policy.
     * </p>
     * 
     * @param executePolicyRequest
     *        Contains the parameters for ExecutePolicy.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ExecutePolicy operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.ExecutePolicy
     */
    java.util.concurrent.Future<ExecutePolicyResult> executePolicyAsync(ExecutePolicyRequest executePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<ExecutePolicyRequest, ExecutePolicyResult> asyncHandler);

    /**
     * <p>
     * Moves the specified instances out of <code>Standby</code> mode.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingGroupLifecycle.html">Auto Scaling
     * Lifecycle</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param exitStandbyRequest
     *        Contains the parameters for ExitStandby.
     * @return A Java Future containing the result of the ExitStandby operation returned by the service.
     * @sample AmazonAutoScalingAsync.ExitStandby
     */
    java.util.concurrent.Future<ExitStandbyResult> exitStandbyAsync(ExitStandbyRequest exitStandbyRequest);

    /**
     * <p>
     * Moves the specified instances out of <code>Standby</code> mode.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingGroupLifecycle.html">Auto Scaling
     * Lifecycle</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param exitStandbyRequest
     *        Contains the parameters for ExitStandby.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ExitStandby operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.ExitStandby
     */
    java.util.concurrent.Future<ExitStandbyResult> exitStandbyAsync(ExitStandbyRequest exitStandbyRequest,
            com.amazonaws.handlers.AsyncHandler<ExitStandbyRequest, ExitStandbyResult> asyncHandler);

    /**
     * <p>
     * Creates or updates a lifecycle hook for the specified Auto Scaling Group.
     * </p>
     * <p>
     * A lifecycle hook tells Auto Scaling that you want to perform an action on an instance that is not actively in
     * service; for example, either when the instance launches or before the instance terminates.
     * </p>
     * <p>
     * This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:
     * </p>
     * <ol>
     * <li>
     * <p>
     * (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when
     * Auto Scaling launches or terminates instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an
     * Amazon SNS topic. The role allows Auto Scaling to publish lifecycle notifications to the target.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.</b>
     * </p>
     * </li>
     * <li>
     * <p>
     * If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you finish before the timeout period ends, complete the lifecycle action.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingGroupLifecycle.html">Auto Scaling
     * Lifecycle</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * If you exceed your maximum limit of lifecycle hooks, which by default is 50 per Auto Scaling group, the call
     * fails. For information about updating this limit, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html">AWS Service Limits</a> in the
     * <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param putLifecycleHookRequest
     *        Contains the parameters for PutLifecycleHook.
     * @return A Java Future containing the result of the PutLifecycleHook operation returned by the service.
     * @sample AmazonAutoScalingAsync.PutLifecycleHook
     */
    java.util.concurrent.Future<PutLifecycleHookResult> putLifecycleHookAsync(PutLifecycleHookRequest putLifecycleHookRequest);

    /**
     * <p>
     * Creates or updates a lifecycle hook for the specified Auto Scaling Group.
     * </p>
     * <p>
     * A lifecycle hook tells Auto Scaling that you want to perform an action on an instance that is not actively in
     * service; for example, either when the instance launches or before the instance terminates.
     * </p>
     * <p>
     * This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:
     * </p>
     * <ol>
     * <li>
     * <p>
     * (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when
     * Auto Scaling launches or terminates instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an
     * Amazon SNS topic. The role allows Auto Scaling to publish lifecycle notifications to the target.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.</b>
     * </p>
     * </li>
     * <li>
     * <p>
     * If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you finish before the timeout period ends, complete the lifecycle action.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingGroupLifecycle.html">Auto Scaling
     * Lifecycle</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * <p>
     * If you exceed your maximum limit of lifecycle hooks, which by default is 50 per Auto Scaling group, the call
     * fails. For information about updating this limit, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html">AWS Service Limits</a> in the
     * <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param putLifecycleHookRequest
     *        Contains the parameters for PutLifecycleHook.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutLifecycleHook operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.PutLifecycleHook
     */
    java.util.concurrent.Future<PutLifecycleHookResult> putLifecycleHookAsync(PutLifecycleHookRequest putLifecycleHookRequest,
            com.amazonaws.handlers.AsyncHandler<PutLifecycleHookRequest, PutLifecycleHookResult> asyncHandler);

    /**
     * <p>
     * Configures an Auto Scaling group to send notifications when specified events take place. Subscribers to the
     * specified topic can have messages delivered to an endpoint such as a web server or an email address.
     * </p>
     * <p>
     * This configuration overwrites any existing configuration.
     * </p>
     * <p>
     * For more information see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASGettingNotifications.html">Getting SNS
     * Notifications When Your Auto Scaling Group Scales</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param putNotificationConfigurationRequest
     *        Contains the parameters for PutNotificationConfiguration.
     * @return A Java Future containing the result of the PutNotificationConfiguration operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsync.PutNotificationConfiguration
     */
    java.util.concurrent.Future<PutNotificationConfigurationResult> putNotificationConfigurationAsync(
            PutNotificationConfigurationRequest putNotificationConfigurationRequest);

    /**
     * <p>
     * Configures an Auto Scaling group to send notifications when specified events take place. Subscribers to the
     * specified topic can have messages delivered to an endpoint such as a web server or an email address.
     * </p>
     * <p>
     * This configuration overwrites any existing configuration.
     * </p>
     * <p>
     * For more information see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASGettingNotifications.html">Getting SNS
     * Notifications When Your Auto Scaling Group Scales</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param putNotificationConfigurationRequest
     *        Contains the parameters for PutNotificationConfiguration.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutNotificationConfiguration operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsyncHandler.PutNotificationConfiguration
     */
    java.util.concurrent.Future<PutNotificationConfigurationResult> putNotificationConfigurationAsync(
            PutNotificationConfigurationRequest putNotificationConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<PutNotificationConfigurationRequest, PutNotificationConfigurationResult> asyncHandler);

    /**
     * <p>
     * Creates or updates a policy for an Auto Scaling group. To update an existing policy, use the existing policy name
     * and set the parameters you want to change. Any existing parameter not changed in an update to an existing policy
     * is not changed in this update request.
     * </p>
     * <p>
     * If you exceed your maximum limit of step adjustments, which by default is 20 per region, the call fails. For
     * information about updating this limit, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html">AWS Service Limits</a> in the
     * <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param putScalingPolicyRequest
     *        Contains the parameters for PutScalingPolicy.
     * @return A Java Future containing the result of the PutScalingPolicy operation returned by the service.
     * @sample AmazonAutoScalingAsync.PutScalingPolicy
     */
    java.util.concurrent.Future<PutScalingPolicyResult> putScalingPolicyAsync(PutScalingPolicyRequest putScalingPolicyRequest);

    /**
     * <p>
     * Creates or updates a policy for an Auto Scaling group. To update an existing policy, use the existing policy name
     * and set the parameters you want to change. Any existing parameter not changed in an update to an existing policy
     * is not changed in this update request.
     * </p>
     * <p>
     * If you exceed your maximum limit of step adjustments, which by default is 20 per region, the call fails. For
     * information about updating this limit, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html">AWS Service Limits</a> in the
     * <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param putScalingPolicyRequest
     *        Contains the parameters for PutScalingPolicy.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutScalingPolicy operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.PutScalingPolicy
     */
    java.util.concurrent.Future<PutScalingPolicyResult> putScalingPolicyAsync(PutScalingPolicyRequest putScalingPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutScalingPolicyRequest, PutScalingPolicyResult> asyncHandler);

    /**
     * <p>
     * Creates or updates a scheduled scaling action for an Auto Scaling group. When updating a scheduled scaling
     * action, if you leave a parameter unspecified, the corresponding value remains unchanged in the affected Auto
     * Scaling group.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/schedule_time.html">Scheduled Scaling</a> in
     * the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param putScheduledUpdateGroupActionRequest
     *        Contains the parameters for PutScheduledUpdateGroupAction.
     * @return A Java Future containing the result of the PutScheduledUpdateGroupAction operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsync.PutScheduledUpdateGroupAction
     */
    java.util.concurrent.Future<PutScheduledUpdateGroupActionResult> putScheduledUpdateGroupActionAsync(
            PutScheduledUpdateGroupActionRequest putScheduledUpdateGroupActionRequest);

    /**
     * <p>
     * Creates or updates a scheduled scaling action for an Auto Scaling group. When updating a scheduled scaling
     * action, if you leave a parameter unspecified, the corresponding value remains unchanged in the affected Auto
     * Scaling group.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/schedule_time.html">Scheduled Scaling</a> in
     * the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param putScheduledUpdateGroupActionRequest
     *        Contains the parameters for PutScheduledUpdateGroupAction.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutScheduledUpdateGroupAction operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsyncHandler.PutScheduledUpdateGroupAction
     */
    java.util.concurrent.Future<PutScheduledUpdateGroupActionResult> putScheduledUpdateGroupActionAsync(
            PutScheduledUpdateGroupActionRequest putScheduledUpdateGroupActionRequest,
            com.amazonaws.handlers.AsyncHandler<PutScheduledUpdateGroupActionRequest, PutScheduledUpdateGroupActionResult> asyncHandler);

    /**
     * <p>
     * Records a heartbeat for the lifecycle action associated with the specified token or instance. This extends the
     * timeout by the length of time defined using <a>PutLifecycleHook</a>.
     * </p>
     * <p>
     * This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:
     * </p>
     * <ol>
     * <li>
     * <p>
     * (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when
     * Auto Scaling launches or terminates instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an
     * Amazon SNS topic. The role allows Auto Scaling to publish lifecycle notifications to the target.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state.</b>
     * </p>
     * </li>
     * <li>
     * <p>
     * If you finish before the timeout period ends, complete the lifecycle action.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingGroupLifecycle.html">Auto Scaling
     * Lifecycle</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param recordLifecycleActionHeartbeatRequest
     *        Contains the parameters for RecordLifecycleActionHeartbeat.
     * @return A Java Future containing the result of the RecordLifecycleActionHeartbeat operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsync.RecordLifecycleActionHeartbeat
     */
    java.util.concurrent.Future<RecordLifecycleActionHeartbeatResult> recordLifecycleActionHeartbeatAsync(
            RecordLifecycleActionHeartbeatRequest recordLifecycleActionHeartbeatRequest);

    /**
     * <p>
     * Records a heartbeat for the lifecycle action associated with the specified token or instance. This extends the
     * timeout by the length of time defined using <a>PutLifecycleHook</a>.
     * </p>
     * <p>
     * This step is a part of the procedure for adding a lifecycle hook to an Auto Scaling group:
     * </p>
     * <ol>
     * <li>
     * <p>
     * (Optional) Create a Lambda function and a rule that allows CloudWatch Events to invoke your Lambda function when
     * Auto Scaling launches or terminates instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) Create a notification target and an IAM role. The target can be either an Amazon SQS queue or an
     * Amazon SNS topic. The role allows Auto Scaling to publish lifecycle notifications to the target.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create the lifecycle hook. Specify whether the hook is used when the instances launch or terminate.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>If you need more time, record the lifecycle action heartbeat to keep the instance in a pending state.</b>
     * </p>
     * </li>
     * <li>
     * <p>
     * If you finish before the timeout period ends, complete the lifecycle action.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingGroupLifecycle.html">Auto Scaling
     * Lifecycle</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param recordLifecycleActionHeartbeatRequest
     *        Contains the parameters for RecordLifecycleActionHeartbeat.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RecordLifecycleActionHeartbeat operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsyncHandler.RecordLifecycleActionHeartbeat
     */
    java.util.concurrent.Future<RecordLifecycleActionHeartbeatResult> recordLifecycleActionHeartbeatAsync(
            RecordLifecycleActionHeartbeatRequest recordLifecycleActionHeartbeatRequest,
            com.amazonaws.handlers.AsyncHandler<RecordLifecycleActionHeartbeatRequest, RecordLifecycleActionHeartbeatResult> asyncHandler);

    /**
     * <p>
     * Resumes the specified suspended Auto Scaling processes, or all suspended process, for the specified Auto Scaling
     * group.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SuspendResume.html">Suspending and Resuming
     * Auto Scaling Processes</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param resumeProcessesRequest
     *        Contains the parameters for SuspendProcesses and ResumeProcesses.
     * @return A Java Future containing the result of the ResumeProcesses operation returned by the service.
     * @sample AmazonAutoScalingAsync.ResumeProcesses
     */
    java.util.concurrent.Future<ResumeProcessesResult> resumeProcessesAsync(ResumeProcessesRequest resumeProcessesRequest);

    /**
     * <p>
     * Resumes the specified suspended Auto Scaling processes, or all suspended process, for the specified Auto Scaling
     * group.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SuspendResume.html">Suspending and Resuming
     * Auto Scaling Processes</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param resumeProcessesRequest
     *        Contains the parameters for SuspendProcesses and ResumeProcesses.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ResumeProcesses operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.ResumeProcesses
     */
    java.util.concurrent.Future<ResumeProcessesResult> resumeProcessesAsync(ResumeProcessesRequest resumeProcessesRequest,
            com.amazonaws.handlers.AsyncHandler<ResumeProcessesRequest, ResumeProcessesResult> asyncHandler);

    /**
     * <p>
     * Sets the size of the specified Auto Scaling group.
     * </p>
     * <p>
     * For more information about desired capacity, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/WhatIsAutoScaling.html">What Is Auto
     * Scaling?</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param setDesiredCapacityRequest
     *        Contains the parameters for SetDesiredCapacity.
     * @return A Java Future containing the result of the SetDesiredCapacity operation returned by the service.
     * @sample AmazonAutoScalingAsync.SetDesiredCapacity
     */
    java.util.concurrent.Future<SetDesiredCapacityResult> setDesiredCapacityAsync(SetDesiredCapacityRequest setDesiredCapacityRequest);

    /**
     * <p>
     * Sets the size of the specified Auto Scaling group.
     * </p>
     * <p>
     * For more information about desired capacity, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/WhatIsAutoScaling.html">What Is Auto
     * Scaling?</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param setDesiredCapacityRequest
     *        Contains the parameters for SetDesiredCapacity.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetDesiredCapacity operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.SetDesiredCapacity
     */
    java.util.concurrent.Future<SetDesiredCapacityResult> setDesiredCapacityAsync(SetDesiredCapacityRequest setDesiredCapacityRequest,
            com.amazonaws.handlers.AsyncHandler<SetDesiredCapacityRequest, SetDesiredCapacityResult> asyncHandler);

    /**
     * <p>
     * Sets the health status of the specified instance.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/healthcheck.html">Health Checks</a> in the
     * <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param setInstanceHealthRequest
     *        Contains the parameters for SetInstanceHealth.
     * @return A Java Future containing the result of the SetInstanceHealth operation returned by the service.
     * @sample AmazonAutoScalingAsync.SetInstanceHealth
     */
    java.util.concurrent.Future<SetInstanceHealthResult> setInstanceHealthAsync(SetInstanceHealthRequest setInstanceHealthRequest);

    /**
     * <p>
     * Sets the health status of the specified instance.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/healthcheck.html">Health Checks</a> in the
     * <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param setInstanceHealthRequest
     *        Contains the parameters for SetInstanceHealth.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetInstanceHealth operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.SetInstanceHealth
     */
    java.util.concurrent.Future<SetInstanceHealthResult> setInstanceHealthAsync(SetInstanceHealthRequest setInstanceHealthRequest,
            com.amazonaws.handlers.AsyncHandler<SetInstanceHealthRequest, SetInstanceHealthResult> asyncHandler);

    /**
     * <p>
     * Updates the instance protection settings of the specified instances.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingBehavior.InstanceTermination.html#instance-protection"
     * >Instance Protection</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param setInstanceProtectionRequest
     *        Contains the parameters for SetInstanceProtection.
     * @return A Java Future containing the result of the SetInstanceProtection operation returned by the service.
     * @sample AmazonAutoScalingAsync.SetInstanceProtection
     */
    java.util.concurrent.Future<SetInstanceProtectionResult> setInstanceProtectionAsync(SetInstanceProtectionRequest setInstanceProtectionRequest);

    /**
     * <p>
     * Updates the instance protection settings of the specified instances.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/AutoScalingBehavior.InstanceTermination.html#instance-protection"
     * >Instance Protection</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param setInstanceProtectionRequest
     *        Contains the parameters for SetInstanceProtection.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetInstanceProtection operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.SetInstanceProtection
     */
    java.util.concurrent.Future<SetInstanceProtectionResult> setInstanceProtectionAsync(SetInstanceProtectionRequest setInstanceProtectionRequest,
            com.amazonaws.handlers.AsyncHandler<SetInstanceProtectionRequest, SetInstanceProtectionResult> asyncHandler);

    /**
     * <p>
     * Suspends the specified Auto Scaling processes, or all processes, for the specified Auto Scaling group.
     * </p>
     * <p>
     * Note that if you suspend either the <code>Launch</code> or <code>Terminate</code> process types, it can prevent
     * other process types from functioning properly.
     * </p>
     * <p>
     * To resume processes that have been suspended, use <a>ResumeProcesses</a>.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SuspendResume.html">Suspending and Resuming
     * Auto Scaling Processes</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param suspendProcessesRequest
     *        Contains the parameters for SuspendProcesses and ResumeProcesses.
     * @return A Java Future containing the result of the SuspendProcesses operation returned by the service.
     * @sample AmazonAutoScalingAsync.SuspendProcesses
     */
    java.util.concurrent.Future<SuspendProcessesResult> suspendProcessesAsync(SuspendProcessesRequest suspendProcessesRequest);

    /**
     * <p>
     * Suspends the specified Auto Scaling processes, or all processes, for the specified Auto Scaling group.
     * </p>
     * <p>
     * Note that if you suspend either the <code>Launch</code> or <code>Terminate</code> process types, it can prevent
     * other process types from functioning properly.
     * </p>
     * <p>
     * To resume processes that have been suspended, use <a>ResumeProcesses</a>.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SuspendResume.html">Suspending and Resuming
     * Auto Scaling Processes</a> in the <i>Auto Scaling User Guide</i>.
     * </p>
     * 
     * @param suspendProcessesRequest
     *        Contains the parameters for SuspendProcesses and ResumeProcesses.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SuspendProcesses operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.SuspendProcesses
     */
    java.util.concurrent.Future<SuspendProcessesResult> suspendProcessesAsync(SuspendProcessesRequest suspendProcessesRequest,
            com.amazonaws.handlers.AsyncHandler<SuspendProcessesRequest, SuspendProcessesResult> asyncHandler);

    /**
     * <p>
     * Terminates the specified instance and optionally adjusts the desired group size.
     * </p>
     * <p>
     * This call simply makes a termination request. The instance is not terminated immediately.
     * </p>
     * 
     * @param terminateInstanceInAutoScalingGroupRequest
     *        Contains the parameters for TerminateInstanceInAutoScalingGroup.
     * @return A Java Future containing the result of the TerminateInstanceInAutoScalingGroup operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsync.TerminateInstanceInAutoScalingGroup
     */
    java.util.concurrent.Future<TerminateInstanceInAutoScalingGroupResult> terminateInstanceInAutoScalingGroupAsync(
            TerminateInstanceInAutoScalingGroupRequest terminateInstanceInAutoScalingGroupRequest);

    /**
     * <p>
     * Terminates the specified instance and optionally adjusts the desired group size.
     * </p>
     * <p>
     * This call simply makes a termination request. The instance is not terminated immediately.
     * </p>
     * 
     * @param terminateInstanceInAutoScalingGroupRequest
     *        Contains the parameters for TerminateInstanceInAutoScalingGroup.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TerminateInstanceInAutoScalingGroup operation returned by the
     *         service.
     * @sample AmazonAutoScalingAsyncHandler.TerminateInstanceInAutoScalingGroup
     */
    java.util.concurrent.Future<TerminateInstanceInAutoScalingGroupResult> terminateInstanceInAutoScalingGroupAsync(
            TerminateInstanceInAutoScalingGroupRequest terminateInstanceInAutoScalingGroupRequest,
            com.amazonaws.handlers.AsyncHandler<TerminateInstanceInAutoScalingGroupRequest, TerminateInstanceInAutoScalingGroupResult> asyncHandler);

    /**
     * <p>
     * Updates the configuration for the specified Auto Scaling group.
     * </p>
     * <p>
     * To update an Auto Scaling group with a launch configuration with <code>InstanceMonitoring</code> set to
     * <code>False</code>, you must first disable the collection of group metrics. Otherwise, you will get an error. If
     * you have previously enabled the collection of group metrics, you can disable it using
     * <a>DisableMetricsCollection</a>.
     * </p>
     * <p>
     * The new settings are registered upon the completion of this call. Any launch configuration settings take effect
     * on any triggers after this call returns. Scaling activities that are currently in progress aren't affected.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify a new value for <code>MinSize</code> without specifying a value for <code>DesiredCapacity</code>,
     * and the new <code>MinSize</code> is larger than the current size of the group, we implicitly call
     * <a>SetDesiredCapacity</a> to set the size of the group to the new value of <code>MinSize</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a new value for <code>MaxSize</code> without specifying a value for <code>DesiredCapacity</code>,
     * and the new <code>MaxSize</code> is smaller than the current size of the group, we implicitly call
     * <a>SetDesiredCapacity</a> to set the size of the group to the new value of <code>MaxSize</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * All other optional parameters are left unchanged if not specified.
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateAutoScalingGroupRequest
     *        Contains the parameters for UpdateAutoScalingGroup.
     * @return A Java Future containing the result of the UpdateAutoScalingGroup operation returned by the service.
     * @sample AmazonAutoScalingAsync.UpdateAutoScalingGroup
     */
    java.util.concurrent.Future<UpdateAutoScalingGroupResult> updateAutoScalingGroupAsync(UpdateAutoScalingGroupRequest updateAutoScalingGroupRequest);

    /**
     * <p>
     * Updates the configuration for the specified Auto Scaling group.
     * </p>
     * <p>
     * To update an Auto Scaling group with a launch configuration with <code>InstanceMonitoring</code> set to
     * <code>False</code>, you must first disable the collection of group metrics. Otherwise, you will get an error. If
     * you have previously enabled the collection of group metrics, you can disable it using
     * <a>DisableMetricsCollection</a>.
     * </p>
     * <p>
     * The new settings are registered upon the completion of this call. Any launch configuration settings take effect
     * on any triggers after this call returns. Scaling activities that are currently in progress aren't affected.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify a new value for <code>MinSize</code> without specifying a value for <code>DesiredCapacity</code>,
     * and the new <code>MinSize</code> is larger than the current size of the group, we implicitly call
     * <a>SetDesiredCapacity</a> to set the size of the group to the new value of <code>MinSize</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a new value for <code>MaxSize</code> without specifying a value for <code>DesiredCapacity</code>,
     * and the new <code>MaxSize</code> is smaller than the current size of the group, we implicitly call
     * <a>SetDesiredCapacity</a> to set the size of the group to the new value of <code>MaxSize</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * All other optional parameters are left unchanged if not specified.
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateAutoScalingGroupRequest
     *        Contains the parameters for UpdateAutoScalingGroup.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAutoScalingGroup operation returned by the service.
     * @sample AmazonAutoScalingAsyncHandler.UpdateAutoScalingGroup
     */
    java.util.concurrent.Future<UpdateAutoScalingGroupResult> updateAutoScalingGroupAsync(UpdateAutoScalingGroupRequest updateAutoScalingGroupRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAutoScalingGroupRequest, UpdateAutoScalingGroupResult> asyncHandler);

}
